package uk.me.johnwilson.minimax.models;

public class TravelTimeArgs {

    public TravelTimeArgs() {
    }

    Port a;
    Port b;
    Vessel v;

    public Port getA() {
        return a;
    }

    public void setA(Port a) {
        this.a = a;
    }

    public Port getB() {
        return b;
    }

    public void setB(Port b) {
        this.b = b;
    }

    public Vessel getV() {
        return v;
    }

    public void setV(Vessel v) {
        this.v = v;
    }
}
