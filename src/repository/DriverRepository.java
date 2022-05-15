package repository;

import Entity.Driver;
import utils.Location;

import java.util.ArrayList;
import java.util.List;

public class DriverRepository {

  List<Driver> drivers;

  public DriverRepository() {
    drivers = new ArrayList<>();
  }

  public void save(Driver driver) {
    drivers.add(driver);
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
