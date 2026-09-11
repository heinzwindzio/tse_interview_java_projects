import java.util.ArrayList;
import java.util.List;

public class Composition {
    
    public static void main(String[] args){

        House house = new House(); // create the house
        List<Room> roomList = house.getRooms(); // get the rooms of the house

        System.out.println("These are the rooms of the house:");        
        for (Room r : roomList){
            System.out.println(r.getRoomName());
        }
    }
}

class House{
    private List<Room> rooms;

    /* WITH COMPOSITION, CREATE THE OBJECTS WITHIN ANOTHER OBJECT */
    public House(){
        this.rooms = new ArrayList<>(); // create list and add the rooms
        this.rooms.add( new Room("Bedroom"));
        this.rooms.add( new Room("Bathroom"));
        this.rooms.add( new Room("Kitchen"));
    }

    public List<Room> getRooms(){
        return this.rooms;
    }
}

class Room{
    private String roomName;

    public Room(String roomName){
        this.roomName = roomName;
    }

    public String getRoomName(){
        return this.roomName;
    }
}
