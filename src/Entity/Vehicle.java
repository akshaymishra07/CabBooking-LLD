package Entity;

public class Vehicle {
  private String number;
  private String model;
  private VehicleCategory category;

  public Vehicle(String number, String model, VehicleCategory category) {
    this.number = number;
    this.model = model;
    this.category = category;
  }

  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public VehicleCategory getCategory() {
    return category;
  }

  public void setCategory(VehicleCategory category) {
    this.category = category;
  }
}
