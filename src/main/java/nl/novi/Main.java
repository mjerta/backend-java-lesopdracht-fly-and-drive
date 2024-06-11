package nl.novi;

import com.sun.source.tree.NewArrayTree;

import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    Car car = new Car();
//    car.startEngine();
//    car.accelerate();
//    car.chageGear();
//    car.turnOffEngine();
//
    Plane plane = new Plane();
//    plane.startEngine();
//    plane.takeOff();
//    plane.changeHeihg();
//    plane.land();
//    plane.turnOffEngine();
//
    FlyingCar flyingCar = new FlyingCar();
//    flyingCar.accelerate();
//    flyingCar.brake();
//    flyingCar.chageGear();
//    flyingCar.land();

    Airport airport = new Airport("Schiphol", "Amsterdam");
    airport.addFlyingVehicles(flyingCar);
    airport.addFlyingVehicles(plane);
    airport.generateInfoOfAirport();
    System.out.println(airport.getFlyingVehicles());
    for (Flyable test : airport.getFlyingVehicles()) {
      test.land();
    }

  }

}