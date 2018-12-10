package uk.me.johnwilson.minimax;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import uk.me.johnwilson.minimax.models.Port;
import uk.me.johnwilson.minimax.models.Restriction;
import uk.me.johnwilson.minimax.models.TravelTimeArgs;
import uk.me.johnwilson.minimax.models.Vessel;
import uk.me.johnwilson.minimax.services.ReadCsvService;
import uk.me.johnwilson.minimax.services.TravelTimeCalculator;

import java.time.LocalDate;

@RestController
@CrossOrigin
public class Controller {

    @Autowired
    ReadCsvService readCsvService;

    @Autowired
    TravelTimeCalculator travelTimeCalculator;

    @GetMapping("/ports")
    @ResponseBody
    public ResponseEntity<?> getPorts(){

        return new ResponseEntity<>(readCsvService.getCsv("Ports.csv", Port.class), HttpStatus.OK);

    }

    @GetMapping("/vessels")
    @ResponseBody
    public ResponseEntity<?> getVessels(){

        return new ResponseEntity<>(readCsvService.getCsv("Vessels.csv", Vessel.class), HttpStatus.OK);

    }

    @GetMapping("/restrictions")
    @ResponseBody
    public ResponseEntity<?> getRestrictions(){

        return new ResponseEntity<>(readCsvService.getCsv("Restrictions.csv", Restriction.class), HttpStatus.OK);

    }


    @PostMapping(value = "/traveltime", produces = "application/json")
    @ResponseBody
    public ResponseEntity<?> getTravelTime(@RequestBody TravelTimeArgs travelTimeArgs) {


        return new ResponseEntity<>(travelTimeCalculator.timeNeededInHours( travelTimeArgs.getA(),
                                                                            travelTimeArgs.getB(),
                                                                            travelTimeArgs.getV()), HttpStatus.OK);

    }



}
