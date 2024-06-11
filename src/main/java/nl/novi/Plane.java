package nl.novi;

public class Plane extends Vehicle implements Flyable {

  @Override
  public void takeOff() {
    System.out.println("The plane took off");

  }

  @Override
  public void land() {
    System.out.println("The plane has landed");
  }

  @Override
  public void changeHeihg() {
    System.out.println("The plane change altidtude");
  }

  @Override
  public void startEngine() {
    System.out.println("The plane has started");
  }

  @Override
  public void turnOffEngine() {
    System.out.println("The planes engine has stopped");
  }
}
