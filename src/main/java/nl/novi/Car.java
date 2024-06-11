package nl.novi;

public class Car extends Vehicle implements Drivable {
  @Override
  public void accelerate() {
    System.out.println("The car gives gas");

  }

  @Override
  public void brake() {
    System.out.println("The car is braking");
  }

  @Override
  public void chageGear() {
    System.out.println("The car is shifting");
  }

  @Override
  public void startEngine() {
    System.out.println("The car is shifting");
  }

  @Override
  public void turnOffEngine() {
    System.out.println("The engine is of the car is stopped");
  }
}
