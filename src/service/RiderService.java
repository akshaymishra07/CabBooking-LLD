package service;

import Entity.Ride;
import Entity.Rider;
import exception.RideNotBookedException;
import repository.RiderRepository;
import utils.Location;

public class RiderService {

  BookingService bookingService = new BookingService();
  RiderRepository riderRepository = new RiderRepository();

  public void save(Rider rider){
    riderRepository.save(rider);
  }

  public Ride bookRide(Rider rider, Location destination) {

    Ride ride = bookingService.bookRide(rider.getLocation(), destination);

    if (ride == null) {
      throw new RideNotBookedException("Your ride cannot be booked at this moment...Try Again!");
    }

    riderRepository.addRide(rider, ride);

    return ride;
  }
}
