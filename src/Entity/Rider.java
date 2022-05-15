package Entity;

import utils.Location;

import java.util.List;

public class Rider {

    private int id;
    private String name;
    private Location location;
    private List<Ride> rides;

    public Rider(int id, String name, Location location, List<Ride> rides) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.rides = rides;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<Ride> getRides() {
        return rides;
    }

    public void setRides(List<Ride> rides) {
        this.rides = rides;
    }
}
