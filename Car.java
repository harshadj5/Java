package Java.OOP;
// Default constructor
public class Car {
    String name;
    int price;

    Car(){
        name ="TATA";
        price =1200000;
    }
    public static void main(String[] args) {
        Car c = new Car();
        System.out.println("Car Name:"+ c.name);
        System.out.println("Car Price:"+ c.price);
    }
    
}
