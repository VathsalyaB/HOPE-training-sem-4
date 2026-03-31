interface A{
    void show();
}
interface B{
    void display();
}
class C implements A{
        public void show(){
            System.out.println("Tam is a potatoe");
        }
}
public class Interface {
    public static void main(String[] args) {
        A c = new C();
        c.show();
    }
}