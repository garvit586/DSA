package inheritance;

public class Car extends Vehicle{
    public Car(int maxSpeed) {
        super(maxSpeed);
    }

    int numGears;

    @Override
    public void print() {
        super.print();
        System.out.println("Car Gears : " + numGears );
    }
}
