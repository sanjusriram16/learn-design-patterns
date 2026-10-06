package behaviouralPattern.statePattern;

public class Main {
    public static void main(String[] args) {
        // Implementation for state pattern example
        TransportationMode car = new Car();
        DirectionService directionService = new DirectionService(car);

        System.out.println(directionService.getDirections());

        TransportationMode cycling = new Cycling();
        directionService.setMode(cycling);

        System.out.println(directionService.getDirections());
    }
}
