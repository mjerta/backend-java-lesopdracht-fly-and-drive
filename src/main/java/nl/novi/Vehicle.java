package nl.novi;

public abstract class Vehicle {
  private int speed;
  private float weight;



  public void startEngine() {
    System.out.println("The engine is started");
  }



  public void turnOffEngine() {
    System.out.println("The engine has stopped");
  }


}
