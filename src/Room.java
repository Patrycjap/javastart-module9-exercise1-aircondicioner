public class Room {

    private double currentTemperature;
    private double surface;
    private boolean hasProAirConditioner;
    private AirConditioner airConditioner;


    public Room(double currentTemperature, double surface, boolean hasProAirConditioner, AirConditioner airConditioner) {
        this.currentTemperature = currentTemperature;
        this.surface = surface;
        this.hasProAirConditioner = hasProAirConditioner;
        this.airConditioner = airConditioner;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getSurface() {
        return surface;
    }

    public String showInfo() {
        return "currentTemperature: " + currentTemperature + ", surface: " + surface + ", hasProAirConditioner:" + hasProAirConditioner;
    }

}





