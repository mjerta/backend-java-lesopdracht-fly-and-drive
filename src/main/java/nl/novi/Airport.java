package nl.novi;

import javax.swing.plaf.TableHeaderUI;
import java.util.ArrayList;
import java.util.List;

public class Airport {
  private String NameOfAirport;
  private String location;
  private List<Flyable> flyingVehicles = new ArrayList<>();

  public Airport(String nameAiport, String location) {
    this.NameOfAirport = nameAiport;
    this.location = location;
  }

  public void addFlyingVehicles(Flyable flyingVehicle) {
    this.flyingVehicles.add(flyingVehicle);
    System.out.println("Added a new flying vehicle");
  }

  public void generateInfoOfAirport() {
    System.out.println("The name of the airport is " + this.getNameAiport() + " and is located in " + this.location);
    System.out.println("The total amount of airplanes " + flyingVehicles.size());
  }

  public String getNameAiport() {
    return NameOfAirport;
  }

  public List<Flyable> getFlyingVehicles() {
    return flyingVehicles;
  }
}
