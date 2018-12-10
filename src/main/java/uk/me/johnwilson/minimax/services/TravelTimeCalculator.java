package uk.me.johnwilson.minimax.services;

import org.springframework.stereotype.Service;
import uk.me.johnwilson.minimax.models.Port;
import uk.me.johnwilson.minimax.models.Vessel;

@Service
public class TravelTimeCalculator implements ITravelTimeCalculator {


    @Override
    public Integer timeNeededInHours(Port A, Port B, Vessel V) {
        return 20*24;
    }
}
