package Entity;

import utils.Location;

public class Ride {

  private Driver driver;
  private BookingStatus status;
  private Location source;
  private Location destination;

  public Ride(Driver driver, BookingStatus status, Location source, Location destination) {
    this.driver = driver;
    this.status = status;
    this.source = source;
    this.destination = destination;
  }

  public Driver getDriver() {
    return driver;
  }

  public void setDriver(Driver driver) {
    this.driver = driver;
  }

  public BookingStatus getStatus() {
    return status;
  }

  public void setStatus(BookingStatus status) {
    this.status = status;
  }

  public Location getSource() {
    return source;
  }

  public void setSource(Location source) {
    this.source = source;
  }

  public Location getDestination() {
    return destination;
  }

  public void setDestination(Location destination) {
    this.destination = destination;
  }
}
