class NameAndRollno{
    int rollno;
    String name;
    NameAndRollno(int rollno, String name){
        this.rollno = rollno;
        this.name = name;
    }
    void display(){
        System.out.println("Name: " + name + " Rollno: " + rollno);
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        NameAndRollno obj1 = new NameAndRollno(234, "Anonymous");
        obj1.display();
        System.out.println(obj1.hashCode());
        NameAndRollno obj2 = new NameAndRollno(236, "Dumbo");
        obj2.display();
        System.out.println(obj2.hashCode());

    }
}
