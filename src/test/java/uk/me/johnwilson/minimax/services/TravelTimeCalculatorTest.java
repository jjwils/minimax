package uk.me.johnwilson.minimax.services;


import org.junit.Test;
import uk.me.johnwilson.minimax.models.Port;
import uk.me.johnwilson.minimax.models.Vessel;

import static org.junit.Assert.assertEquals;


public class TravelTimeCalculatorTest {

    TravelTimeCalculator travelTimeCalculator = new TravelTimeCalculator();

    @Test
    public void testtravelTimeCalculator() {

        assertEquals(travelTimeCalculator.timeNeededInHours(new Port(), new Port(), new Vessel()), Integer.valueOf(480));
    }


}