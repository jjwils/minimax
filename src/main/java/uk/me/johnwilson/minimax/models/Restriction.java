package uk.me.johnwilson.minimax.models;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"vessel", "port"})
public class Restriction {
    String vessel;
    String port;

    public String getVessel() {
        return vessel;
    }

    public void setVessel(String vessel) {
        this.vessel = vessel;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
