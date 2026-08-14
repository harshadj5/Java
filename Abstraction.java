package Java.OOP;
abstract class Vehicle{
    abstract void start();
}
class Car extends Vehicle{
    void start(){
        System.out.println("Car start with a key");
    }
}
public class Abstraction {
    public static void main(String[]args){
        Car c = new Car();
        c.start();
    }
}
