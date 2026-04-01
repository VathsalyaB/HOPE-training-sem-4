
public class WrapperClasses {
    public static void main(String[] args) {
        int a = 10;
        Integer b = Integer.valueOf(a); // Boxing
        Integer c = a; // Auto-boxing

        
        System.out.println("Primitive int: " + a);
        System.out.println("Wrapper Integer (Boxing): " + b);
        System.out.println("Wrapper Integer (Auto-boxing): " + c);

        int d = b.intValue(); // Unboxing
        int e = c; // Auto-unboxing

        System.out.println("Unboxed int (from b): " + d);
        System.out.println("Unboxed int (from c): " + e);
    }
}
