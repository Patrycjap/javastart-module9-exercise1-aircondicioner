public class BasicAirConditioner extends AirConditioner {


    public void turnOnAirConditionerFor(Room room) {
        lowerTemp(room);
        System.out.println("Klimatyzacja BasicAir włączona");

    }


    public double lowerTemp(Room room) {
        double tempToDecrease = room.getSurface() / 100;
        double finalTemp = checkConditionAndReturnTemperature(room) - tempToDecrease;
        return finalTemp;

    }



}
