public class task_3 {
    public static void main(String[] args){
        EconomyRoom room1 = new EconomyRoom(101, 100);
        StandartRoom room2 = new StandartRoom(202, 500);
        LuxRoom room3 = new LuxRoom(303, 1500);
        UltraLuxRoom room4 = new UltraLuxRoom(707, 5000);

        // Room room5 = new Room(); //Cannot instantiate the type Room
        // ProRoom room6 = new ProRoom(); //Cannot instantiate the type ProRoom
        room1.showInfo();
        room2.showInfo();
        room3.showInfo();
        room4.showInfo();

        RoomService<EconomyRoom> eService = new HotelRoomService<>();
        RoomService<StandartRoom> stService = new HotelRoomService<>();
        RoomService<LuxRoom> lxService = new HotelRoomService<>();
        RoomService<UltraLuxRoom> ulxService = new HotelRoomService<>();
        RoomService<Room> uniService = new HotelRoomService<>();

        System.out.println("\nIs the econom room booked? " + room1);
        eService.reserve(room1);
        System.out.println("And now? " + room1);

        System.out.println("\nClean lux room ");
        lxService.clean(room3);

        ulxService.reserve(room4);
        System.out.println("Is ultra lux room vacate? " + room4);
        ulxService.free(room4);
        System.out.println("\nAnd now? " + room4);

        stService.reserve(room2);
        System.out.println("Is standart room booked? " + room2);
        uniService.reserve(room2);
    }
}
