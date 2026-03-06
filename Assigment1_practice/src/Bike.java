public class Bike extends Vehicle{
    String hasGear;

    Bike(String brand , int speed , String hasGear ){
        super(brand , speed );
        this.hasGear = hasGear;
    }

    public String getHasGear() {
        return hasGear;
    }

    public void setHasGear(String hasGear) {
        this.hasGear = hasGear;
    }

    void display(){
        super.display();
        System.out.println("Has Gear: " + hasGear);
    }
}