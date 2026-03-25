
public class ClassObjects {
    public static void main(String[] args) {
        System.out.println("Im inside ClassObjects class");
        Apartment obj = new Apartment();
        obj.display();
    }
}
class Apartment{
    void display(){
        System.out.println("Im inside Apartment class");
    }
}
