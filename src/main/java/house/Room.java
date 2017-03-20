package house;

public class Room {
    public Room(){

    }
    public Room(String name){
        this.name=name;
    }
    public Room(Room room){
        name=room.getName();
        temp=room.getTemp();
        windowOpen=room.isWindowOpen();
        alarmLocked=room.isAlarmLocked();
        lightsOn=room.isLightsOn();
    }
    private String name;
    private double temp=20.0;
    private boolean windowOpen=true;
    private boolean alarmLocked=false;
    private boolean lightsOn=false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public boolean isWindowOpen() {
        return windowOpen;
    }

    public void setWindowOpen(boolean windowOpen) {
        this.windowOpen = windowOpen;
    }

    public boolean isAlarmLocked() {
        return alarmLocked;
    }

    public void setAlarmLocked(boolean alarmLocked) {
        this.alarmLocked = alarmLocked;
    }

    public boolean isLightsOn() {
        return lightsOn;
    }

    public void setLightsOn(boolean lightsOn) {
        this.lightsOn = lightsOn;
    }



}
