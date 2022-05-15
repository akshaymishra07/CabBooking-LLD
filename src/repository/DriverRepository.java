package repository;

import Entity.Driver;
import utils.Location;

import java.util.ArrayList;
import java.util.List;

public class DriverRepository {

  List<Driver> drivers;

  DriverRepository() {
    drivers = new ArrayList<>();
  }

  public void save(Driver driver) {
    drivers.add(driver);
  }

  public void updateLocation(Driver driver, Location newLocation) {

    for (Driver d : drivers) {
      if (d.getId() == driver.getId()) {
        d.setLocation(newLocation);
        return;
      }
    }
  }
}
