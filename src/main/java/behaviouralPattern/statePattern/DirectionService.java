package behaviouralPattern.statePattern;

public class DirectionService {
    private  TransportationMode mode;

    public DirectionService(TransportationMode mode) {
        this.mode = mode;
    }

    public void setMode(TransportationMode mode) {
        this.mode = mode;
    }

    public String getDirections() {
        return "Mode: " + mode.getMode() + ", ETA: " + mode.getETA();
    }
}
