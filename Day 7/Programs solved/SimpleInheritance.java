
class Parent{
    void display(){
        System.out.println("Inside parent class called");
    }
}
class Child extends Parent{
    void display1(){
        System.out.println("Inside child class");
    }
}
public class SimpleInheritance {
    public static void main(String[] args) {
        System.out.println("Inside main class");
        Child c = new Child();
        c.display();
        c.display1();
    }
}
