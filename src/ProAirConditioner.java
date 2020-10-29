public class ProAirConditioner extends AirConditioner {


    public Room turnOnAirConditionerFor(Room room) {
        double newCurrentTemperature = lowerTemp();
        return new Room(newCurrentTemperature, room.getSurface(), room.isHasProAirConditioner());
    }


    @Override
    public double lowerTemp() {
        return super.lowerTemp();

    }


}





