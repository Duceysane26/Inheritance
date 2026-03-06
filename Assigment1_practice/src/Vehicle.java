public class Vehicle {

    //VARIABLES
    String brand;
    int speed;

    //constructors
    public Vehicle(String barand, int speed) {
        this.brand = barand;
        this.speed = speed;
    }
    //getters
    public String getBarand() {
        return brand;
    }

    public int getSpeed() {

        return speed;
    }
    //setters
    public void setBarand(String barand) {

        this.brand = barand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //methods
  void display(){
      System.out.println("brand:"+ brand);
      System.out.println("speed:"+speed);
  }

}
