public class Car extends Vehicle {
   int numberOfDoors;
    Car(String brand , int speed, int numberOfDoors){
        super(brand,speed);
        this.numberOfDoors = numberOfDoors;

    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    //method
    void display(){
        super.display();
        System.out.println("Number of doors: " + numberOfDoors);
    }
}