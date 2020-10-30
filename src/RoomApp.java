public class RoomApp {

    public static void main(String[] args) {


        ProAirConditioner proAir = new ProAirConditioner();
        BasicAirConditioner basicAir = new BasicAirConditioner();


        Room room1 = new Room(30, 60, false, basicAir);
        Room room2 = new Room(25, 50, true, proAir);

        Room rooms[] = {room1, room2};

        basicAir.turnOnAirConditionerFor(room1);
        proAir.turnOnAirConditionerFor(room2);


        for (int i = 0; i < rooms.length; i++) {
            System.out.println(rooms[i].showInfo());
        }




    }
}
