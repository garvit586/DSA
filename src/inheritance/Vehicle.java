package inheritance;

public class Vehicle {
    String color;
    int maxSpeed;
    int height;
    int weight;

    public Vehicle(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }

    public void print(){
        System.out.println("vehicle color : " + color);
        System.out.println("vehicle maxSpeed : " + maxSpeed);
        System.out.println("vehicle height : " + height);
        System.out.println("vehicle weight : " + weight);
    }
}
