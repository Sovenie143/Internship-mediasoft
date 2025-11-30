import java.util.Random;

abstract class Room {
    private int roomNumber;
    private int capacity;
    private int priceNight;
    private boolean booking;
    
    public Room(){
        this.roomNumber = 1;
        this.capacity = new Random().nextInt(10) + 1;
        this.priceNight = 1;
        this.booking = false;
    }

    public Room(int roomNumber,int priceNight){
        this.roomNumber = roomNumber;
        this.capacity = new Random().nextInt(10) + 1;
        this.priceNight = priceNight;
        this.booking = false;
    }

    public Room(int roomNumber, int capacity, int priceNight, boolean booking){
        this.roomNumber = roomNumber;
        this.capacity = new Random().nextInt(10) + 1;
        this.priceNight = priceNight;
        this.booking = booking;
    }

    void showInfo(){
        String s = String.format("Room %d, capacity %d, price per night %d, booking %b", 
        roomNumber, capacity, priceNight, booking);

        System.out.println(s);
    }

    public int getRoomNumber(){
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber){
        this.roomNumber = roomNumber;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setCapacity(int capacity){
        this.capacity = capacity;
    }

    public int getPriceNight(){
        return priceNight;
    }

    public void setPriceNight(int priceNight){
        this.priceNight = priceNight;
    }

    public boolean isBooking(){
        return booking;
    }

    public void setBooking(boolean booking){
        this.booking = booking;
    }

}

class EconomyRoom extends Room{
    public EconomyRoom(){
        super();
    }

    public EconomyRoom(int roomNumber, int capacity, int priceNight, boolean booking){
        super(roomNumber, capacity, priceNight, booking);
    }

    public EconomyRoom(int roomNumber,int priceNight){
        super(roomNumber, priceNight);
    }
}

abstract class ProRoom extends Room{
    public ProRoom(){
        super();
    }

    public ProRoom(int roomNumber, int capacity, int priceNight, boolean booking){
        super(roomNumber, capacity, priceNight, booking);
    }

    public ProRoom(int roomNumber,int priceNight){
        super(roomNumber, priceNight);
    }
}

class StandartRoom extends ProRoom{
    public StandartRoom(){
        super();
    }

    public StandartRoom(int roomNumber, int capacity, int priceNight, boolean booking){
        super(roomNumber, capacity, priceNight, booking);
    }

    public StandartRoom(int roomNumber,int priceNight){
        super(roomNumber, priceNight);
    }
}

class LuxRoom extends ProRoom{
    public LuxRoom(){
        super();
    }
    
    public LuxRoom(int roomNumber, int capacity, int priceNight, boolean booking){
        super(roomNumber, capacity, priceNight, booking);
    }

    public LuxRoom(int roomNumber,int priceNight){
        super(roomNumber, priceNight);
    }
}

class UltraLuxRoom extends ProRoom{
    public UltraLuxRoom(){
        super();
    }

    public UltraLuxRoom(int roomNumber, int capacity, int priceNight, boolean booking){
        super(roomNumber, capacity, priceNight, booking);
    }

    public UltraLuxRoom(int roomNumber,int priceNight){
        super(roomNumber, priceNight);
    }
}

class HotelRoomService<T extends Room> implements RoomService<T>{
    @Override
    public void clean(T room){
        System.out.println("Room number " + room.getRoomNumber() + " cleaned");
    }

    @Override
    public void reserve(T room){
        if (room.isBooking()){
            throw new RoomAlreadyBookedException("The room is already booked.");
        } else{
            room.setBooking(true);
            System.out.println("Room number " + room.getRoomNumber() + " is booked");
        }
    }
    
    @Override
    public void free(T room){
        if (room.isBooking()){
            room.setBooking(false);
            System.out.println("Room number " + room.getRoomNumber() + " is vacated");
        } else{
            System.out.println("Room number " + room.getRoomNumber() + " is already vacated");
        }
    }
}
