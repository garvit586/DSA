package inheritance;

public class VehicleUse {
    public static void main(String[] args) {
        Vehicle v = new Vehicle(100);
        v.weight = 200;
        v.height = 100;
        v.color = "pink";

        v.print();

        Car c = new Car(500);
        c.color = "Black";
        c.numGears = 5;
        c.print();


    }
}
