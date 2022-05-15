/*
The location is represented as a (x, y) coordinate.
Distance between two points (x1, y1) and(x2, y2) is sqrt((x1-x2)^2 + (y1-y2)^2).
Platform has decided upon maximum distance a driver has to travel to pickup a rider.
A cab has only 1 driver.
Sharing of cab is not allowed between riders.
There is a single type of cab.
Please build an application that exposes following features to riders and drivers.

Register a rider.
Register a driver/cab
Update a cab's location
A driver can switch on/off his availability
A rider can book a cab
Fetch history of all rides taken by a rider.
End the Trip
*/

import Entity.*;
import service.DriverService;
import service.RiderService;
import utils.Location;

public class CabBookingApplication {

  public static void main(String[] args) {

    DriverService driverService = new DriverService();
    RiderService riderService = new RiderService();

    driverService.save(new Driver(1, "D1",
            new Location(12, 16),
            new Vehicle("KA23W5565", "Swift Dzire", VehicleCategory.SEDAN), true));

    driverService.save(new Driver(2, "D2",
            new Location(20, 11),
            new Vehicle("KA23W5235", "Baleno", VehicleCategory.HATCHBACK), true));

    driverService.save(new Driver(3, "D3",
            new Location(12, 9),
            new Vehicle("KA23W5415", "Mhindra Xylo", VehicleCategory.SUV), true));

    driverService.save(new Driver(4, "D4",
            new Location(12, 12),
            new Vehicle("KA23W55325", "Audi A4", VehicleCategory.PRIME), true));


    Rider rider = new Rider(1,"R1", new Location(12,11));
    riderService.save(rider);

    Ride ride = riderService.bookRide(rider, new Location(23,25));

    System.out.println(ride);

  }
}
