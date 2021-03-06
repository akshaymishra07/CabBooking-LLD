package Entity;

import utils.Location;

import java.util.List;

//methods for updating or setting new values in the list or map of entity can exist in entities class only.

public class Rider {

    private int id;
    private String name;
    private Location location;
    private List<Ride> rides;  // list of all the rides taken by this rider

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

    @Override
    public String toString() {
        return "Rider{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", rides=" + rides +
                '}';
    }
}
