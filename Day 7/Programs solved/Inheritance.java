class Animal{
    void display(){
        System.out.println("Inside class Animal");
    }
}
class Dog{
    void bark(){
        System.out.println("Dog barks");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        Dog sound = new Dog();
        sound.bark();
        System.out.println(sound.hashCode());
        //System.out.println(sound.bark().hashCode());

    }
}
