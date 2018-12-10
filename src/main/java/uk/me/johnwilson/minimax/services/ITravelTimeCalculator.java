package uk.me.johnwilson.minimax.services;

import uk.me.johnwilson.minimax.models.Port;
import uk.me.johnwilson.minimax.models.Vessel;

public interface ITravelTimeCalculator {



    public Integer timeNeededInHours(Port A, Port B, Vessel V);
}

