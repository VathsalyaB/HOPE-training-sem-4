class DConstruct{
    int x;
    DConstruct(int x){
        this.x = x;
        System.out.println("Im inside Parametrised construct");
    }
}
public class DefaultConstructor {
    DefaultConstructor(){
        System.out.println("Im inside default constructor");
    }
    public static void main(String[] args) {
        System.out.println("Im inside class");
        DConstruct dc = new DConstruct(4);
        System.out.println(dc);
    }
}

