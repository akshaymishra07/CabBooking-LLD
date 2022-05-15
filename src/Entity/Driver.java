package Entity;

import utils.Location;

public class Driver {
  private int id;
  private int name;
  private Location location;
  private Vehicle vehicle;
  private boolean availability;

  public Driver(int id, int name, Location location, Vehicle vehicle, boolean availability) {
    this.id = id;
    this.name = name;
    this.location = location;
    this.vehicle = vehicle;
    this.availability = availability;
  }

  public boolean isAvailability() {
    return availability;
  }

  public void setAvailability(boolean availability) {
    this.availability = availability;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getName() {
    return name;
  }

  public void setName(int name) {
    this.name = name;
  }

  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }
}
