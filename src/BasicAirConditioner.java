public class BasicAirConditioner extends AirConditioner {


    public Room turnOnAirConditionerFor(Room room) {
        double newCurrentTemperature = lowerTemp();
        return new Room(newCurrentTemperature, room.getSurface(), room.isHasProAirConditioner());
    }


    public double lowerTemp() {
        double tempToDecrease = getSurface() / 100;
        double finalTemp = checkConditionAndReturnTemperature() - tempToDecrease;
        return finalTemp;

    }


    @Override
    public double checkConditionAndReturnTemperature() {
        return super.checkConditionAndReturnTemperature();
    }


}
