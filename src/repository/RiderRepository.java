package repository;

import Entity.Rider;

import java.util.ArrayList;
import java.util.List;

public class RiderRepository {

  List<Rider> riders;

  RiderRepository() {
    riders = new ArrayList<>();
  }

  public void save(Rider rider) {
    riders.add(rider);
  }
}
