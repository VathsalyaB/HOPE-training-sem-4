
class Encapsulation{
    int b;
    Encapsulation(int a){
        b = a;
    }
    void display(){
        System.out.println("Value of a: Implementation of Encapsulation " + b);
    }
}
class EncapsulationImplementation {
    public static void main(String[] args) {
        Encapsulation e = new Encapsulation(7);
        e.display();
    }
}
