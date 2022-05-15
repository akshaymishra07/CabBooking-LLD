package service;

import Entity.Driver;
import repository.DriverRepository;
import utils.CalculateDistance;
import utils.Location;

import java.util.List;

public class DriverService {

  DriverRepository driverRepository = new DriverRepository();

  public void save(Driver driver) {
    driverRepository.save(driver);
  }

  public void setToUnavailable(Driver driver) {
    driverRepository.setUnavailable(driver);
  }

  public void setToAvailable(Driver driver) {
    driverRepository.setAvailable(driver);
  }

  public void changeLocation(Driver driver, Location newLocation) {
    driverRepository.updateLocation(driver, newLocation);
  }

  public Driver matchDriver(Location riderLocation) {
    List<Driver> drivers = driverRepository.findAll();

    for (Driver d : drivers) {

      if (CalculateDistance.pickupPossible(d.getLocation(), riderLocation)
          && d.isAvailability() == true) {
        return d;
      }
    }
    return null;
  }
}
