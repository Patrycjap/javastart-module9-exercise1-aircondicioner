public class AirConditioner {
    public static final double MAX_LOW_TEMPERATURE = 21;
    private Room room;
    private static int number = 0;
    private int id;


    public AirConditioner() {
        id = number;
    }


    public double getSurface() {
        return room.getSurface();

    }


    public double lowerTemp() {
        return checkConditionAndReturnTemperature() - 1;

    }

    public double checkConditionAndReturnTemperature() {
        double tempToCheck = room.getCurrentTemperature();
        while (tempToCheck > MAX_LOW_TEMPERATURE) {
            number++;
        }
        return tempToCheck;

    }

    public Room turnOnAirConditionFor(Room room) {
        System.out.println("Nie umiem włączyć kliamtyzacji dla tego typu klimatyzacji");
        return null;
    }


}



