package behaviouralPattern.statePattern;

public class Cycling implements TransportationMode {
    @Override
    public String getMode() {
        return "Cycling";
    }

    @Override
    public String getETA() {
        return "30 minutes";
    }
}
