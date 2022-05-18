package repository;

import Entity.Driver;
import utils.Location;

import java.util.ArrayList;
import java.util.List;

//every repository class must contain only the CRUD methods for that particular entity.


public class DriverRepository {

  static List<Driver> drivers = new ArrayList<>();

  // make save method return the driver
  public Driver save(Driver driver) {
    drivers.add(driver);
    return driver;
  }

  public List<Driver> findAll() {
    return drivers;
  }

  public void updateLocation(Driver driver, Location newLocation) {

    for (Driver d : drivers) {
      if (d.getId() == driver.getId()) {
        d.setLocation(newLocation);
        return;
      }
    }
  }

  // move these 3 methods to driver class
  public void setUnavailable(Driver driver) {

    for (Driver d : drivers) {
      if (d.getId() == driver.getId()) {
        d.setAvailability(false);
        return;
      }
    }
  }

  public void setAvailable(Driver driver) {

    for (Driver d : drivers) {
      if (d.getId() == driver.getId()) {
        d.setAvailability(true);
        return;
      }
    }
  }
}
