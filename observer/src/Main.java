public class Main {
    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        DisplayDevice device1 = new DisplayDevice("phone");
        DisplayDevice device2 = new DisplayDevice("laptop");
        weatherStation.registerObserver(device1);
        weatherStation.registerObserver(device2);

        weatherStation.setTemperature(50.0f);

    }
}