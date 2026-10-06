package behaviouralPattern.statePattern;

public class Car implements TransportationMode {
    @Override
    public String getMode() {
        return "Car";
    }

    @Override
    public String getETA() {
        return "15 minutes";
    }
}
