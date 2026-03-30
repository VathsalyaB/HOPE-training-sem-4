class Animal {
    void display() {
        System.out.println("Inside class Animal");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Dog sound = new Dog();
        sound.bark();
        sound.display();
        System.out.println(sound.hashCode());
    }
}