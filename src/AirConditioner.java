public class AirConditioner {
    public static final double MAX_LOW_TEMPERATURE = 21;
    private static int number = 0;
    private int id;


    public AirConditioner() {
        id = number;
    }


    public double lowerTemp(Room room) {
        return checkConditionAndReturnTemperature(room) - 1;

    }

    public double checkConditionAndReturnTemperature(Room room) {
        double tempToCheck = room.getCurrentTemperature();
        while (tempToCheck > MAX_LOW_TEMPERATURE) {
            number++;
        }
        return tempToCheck;

    }

    public void turnOnAirConditionFor(Room room) {
        lowerTemp(room);
        System.out.println("Nie umiem włączyć kliamtyzacji dla tego typu klimatyzacji");
    }


}



