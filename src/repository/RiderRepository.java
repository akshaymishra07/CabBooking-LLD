package repository;

import Entity.Ride;
import Entity.Rider;

import java.util.ArrayList;
import java.util.List;

public class RiderRepository {

  List<Rider> riders;

  public RiderRepository() {
    riders = new ArrayList<>();
  }

  public void save(Rider rider) {
    riders.add(rider);
  }

  public void addRide(Rider rider, Ride ride) {

    for (Rider r : riders) {

      if (r.getId() == rider.getId()) {
        r.getRides().add(ride);
        return;
      }
    }
  }
}
