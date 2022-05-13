package at.campus02.iwi;

public class HouseApp {
    public static void main(String[] args) {



        // create simple house
        //    F            F
        //    S  T   G  T   WK   F
        //           G
        //  F S  T   G  E-T
        //
        // (F Fenster, S Schlafzimmer, T Tür, G Gang, WK WOHNKÜCHE; E-T Eingangstür)


        Room corridor = new Room(RoomType.CORRIDOR, 15);
        Room masterBed = new Room(RoomType.BEDROOM, 13);
        Room secondBed = new Room(RoomType.BEDROOM, 11);
        Room eatinKitchen = new Room(RoomType.EATINKITCHEN, 27);



        eatinKitchen.addOpening(Orientation.EAST, new Window(20,30, 50, 100,true));
        eatinKitchen.addOpening(Orientation.NORTH, new Window(20,30, 50, 100,true));

        masterBed.addOpening(Orientation.NORTH, new Window(22,30, 50, 100,true));

        secondBed.addOpening(Orientation.WEST, new Window(25,30, 50, 100,true));

        corridor.addOpening(Orientation.EAST, new HouseDoor(20, 40, 100, 200, corridor, true));

        Door d = new Door(20, 30, 90, 200, corridor, eatinKitchen);
        corridor.addOpening(Orientation.EAST, d);
        eatinKitchen.addOpening(Orientation.WEST, d);

        d = new Door(40, 30, 90, 200, masterBed, corridor);
        corridor.addOpening(Orientation.WEST, d);
        masterBed.addOpening(Orientation.EAST, d);
        d = new Door(70, 30, 90, 200, secondBed, corridor);
        corridor.addOpening(Orientation.WEST, d);
        secondBed.addOpening(Orientation.EAST, d);

        House h = new House();
        h.addRoom(corridor);
        h.addRoom(masterBed);
        h.addRoom(secondBed);
        h.addRoom(eatinKitchen);
        System.out.println(h.getWindowAreaFacingOrientation(Orientation.NORTH));

        System.out.println(h.getAllConnectedRooms(corridor));

        System.out.println(h.getNumberOfOpeningsInRoomType(RoomType.BEDROOM));

    }
}
