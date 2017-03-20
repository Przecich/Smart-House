package restServer;

import house.House;
import house.Room;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shouseService.HouseDataService;

@RestController
public class HouseCommandController {
    HouseDataService house = new HouseDataService();

    @RequestMapping(value = "/house", method = RequestMethod.GET)
    public Room greeting(@RequestParam(value = "room", required = true) String name) {

        return house.getRoom(name);


    }

    @RequestMapping(value = "/allhouse", method = RequestMethod.GET)
    public House getHouse() {
        return house.getHouse();
    }

    @RequestMapping(value = "/room", method = RequestMethod.PUT)
    public ResponseEntity<Room> updateUser(@RequestBody Room room) {
        System.out.println("Updating Room: " + room.getName());

        Room currentRoom = house.getHouse().rooms.stream()
                .filter(x -> x.getName().equals(room.getName()))
                .findFirst().orElse(new Room("empty"));

        house.getHouse().rooms.remove(currentRoom);

        if (room.getName().equals("empty")) {
            System.out.println("Room with name " + room.getName() + " not found");
            return new ResponseEntity<Room>(HttpStatus.NOT_FOUND);
        }

        currentRoom = new Room(room);
        System.out.println(currentRoom.getTemp());
        house.getHouse().rooms.add(currentRoom);


        return new ResponseEntity<Room>(currentRoom, HttpStatus.OK);
    }


}
