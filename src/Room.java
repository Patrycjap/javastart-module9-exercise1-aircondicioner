public class Room {

    private double currentTemperature;
    private double surface;
    private boolean hasProAirConditioner;


    public Room(double currentTemperature, double surface, boolean hasProAirConditioner) {
        this.currentTemperature = currentTemperature;
        this.surface = surface;
        this.hasProAirConditioner = hasProAirConditioner;
    }

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getSurface() {
        return surface;
    }

    public boolean isHasProAirConditioner() {
        return hasProAirConditioner;
    }

    public void print() {

        System.out.println("currentTemperature:" + currentTemperature);
        System.out.println("surface:" + surface);
        System.out.println("hasProAirConditioner:" + hasProAirConditioner);
    }


}
