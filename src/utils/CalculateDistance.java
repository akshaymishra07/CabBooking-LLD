package utils;

public class CalculateDistance {
  private static final int MAX_DISTANCE = 5;

  public static boolean pickupPossible(Location driverLocation, Location riderLocation) {

    int x1 = driverLocation.getX();
    int y1 = driverLocation.getX();
    int x2 = riderLocation.getX();
    int y2 = riderLocation.getY();

    int distance = (int) Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));

    return true;

    //return distance <= MAX_DISTANCE ? true : false;
  }
}
