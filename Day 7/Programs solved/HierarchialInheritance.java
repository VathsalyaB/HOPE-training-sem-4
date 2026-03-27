class Vehicle{
    void starts(){
        System.out.println("Engine starts");
    }
}
class Car{
    void move(){
        System.out.println("Car is moving");
    }
}
class Truck{
    void move(){
        System.out.println("Truck is moving");
    }
}
public class HierarchialInheritance{
    public static void main(String[] args) {
        Car c = new Car();
        c.move();
        Truck t = new Truck();
        t.move();
    }
}