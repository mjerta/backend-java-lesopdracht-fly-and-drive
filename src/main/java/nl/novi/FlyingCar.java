package nl.novi;

public class FlyingCar extends Vehicle implements Flyable, Drivable {
  @Override
  public void accelerate() {
    System.out.println("The fyling car is giving gas");
  }

  @Override
  public void brake() {
    System.out.println("The fyling car is braking");
  }

  @Override
  public void chageGear() {
    System.out.println("The flying car is chaning gear");
  }

  @Override
  public void takeOff() {
    System.out.println("the flying carr is is taking off");
  }

  @Override
  public void land() {
    System.out.println("The flying car is landing");

  }

  @Override
  public void changeHeihg() {
    System.out.println("The flying car is landing");
  }

  @Override
  public void startEngine() {
    super.startEngine();
  }

  @Override
  public void turnOffEngine() {
    super.turnOffEngine();
  }
}
