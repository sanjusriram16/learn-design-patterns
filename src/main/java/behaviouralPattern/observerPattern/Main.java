package behaviouralPattern.observerPattern;

public class Main {
    static void main() {
        WeatherStation weatherStation = new WeatherStation();

        Observer mobileObserver = new Observer() {
            @Override
            public void update(float temperature) {
                System.out.println("Updating mobile temperature to: " + temperature);
            }
        };

        Observer arduinoObserver = new Observer() {
            @Override
            public void update(float temperature) {
                System.out.println("Updating arduino temperature to: " + temperature);
            }
        };

        weatherStation.registerObserver(mobileObserver);
        weatherStation.registerObserver(arduinoObserver);

        weatherStation.setTemperature(40f);

        weatherStation.removeObserver(arduinoObserver);

        weatherStation.setTemperature(39f);
    }
}
