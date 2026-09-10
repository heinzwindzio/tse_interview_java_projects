import java.util.List;

public class Composition {
    
    public static void main(String[] args){

        House house = new House();
    }
}

public class House{

    private List<Room> rooms;

    public House(){

        this.rooms = new ArrayList<>(); // create list and add the rooms
        this.rooms.add( new Room("Bedroom");
        this.rooms.add( new Room("Bathroom");
        this.rooms.add( new Room("Kitchen");
    }

    public Room getRooms(){
        return this.room;

    }
}
public class Room{

    private String roomName;

    public Room(String roomName){
        this.roomName = roomName;
    }

    public getRoomName(){
        return this.roomName;
    }
}
