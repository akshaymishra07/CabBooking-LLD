package Entity;

import utils.Location;

public class Driver {
  private int id;
  private String name;
  private Location location; // change after ending the ride
  private Vehicle vehicle;
  private boolean availability; // change to unavailable after starting a ride

  public Driver(int id, String name, Location location, Vehicle vehicle, boolean availability) {
    this.id = id;
    this.name = name;
    this.location = location;
    this.vehicle = vehicle;
    this.availability = availability;
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

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public boolean isAvailability() {
    return availability;
  }

  public void setAvailability(boolean availability) {
    this.availability = availability;
  }

  @Override
  public String toString() {
    return "Driver{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", location=" + location +
            ", vehicle=" + vehicle +
            ", availability=" + availability +
            '}';
  }
}
