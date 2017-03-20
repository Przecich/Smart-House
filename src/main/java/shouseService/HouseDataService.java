package shouseService;

import house.House;
import house.Room;


public class HouseDataService {
    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    private House house=new House();

    public HouseDataService(){
        house.addRoom(new Room("BathRoom"));
        house.addRoom(new Room("BathRoom1"));
        house.addRoom(new Room("BedRoom"));
        house.addRoom(new Room("BedRoom1"));
        house.addRoom(new Room("BathRoom1"));
        house.addRoom(new Room("Kitchen"));
        house.addRoom(new Room("LivingRoom"));
        house.addRoom(new Room("Hall"));
        house.addRoom(new Room("Patio"));
        house.addRoom(new Room("SmallCloset"));
        house.addRoom(new Room("BigCloset"));
    }
    public Room getRoom(String name){

        return house.rooms.stream()
                .filter(x->x.getName().equals(name))
                .findAny().orElse(new Room("EmptyFROMSERVER"));
    }

}
