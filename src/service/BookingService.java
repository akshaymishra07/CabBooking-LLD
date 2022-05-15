package service;

import Entity.BookingStatus;
import Entity.Driver;
import Entity.Ride;
import utils.Location;

public class BookingService {

  DriverService driverService = new DriverService();

  public Ride bookRide(Location riderLocation, Location destination) {

    Driver driver = driverService.matchDriver(riderLocation);

    if (driver == null) {
      return null;
    }
    driverService.setToUnavailable(driver);
    return new Ride(driver, BookingStatus.BOOKED, riderLocation, destination);
  }
}
