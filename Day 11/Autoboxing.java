public class Autoboxing{
    public static void main (String[] args) {
        // Autoboxing: converting primitive to wrapper class
        int num = 10;
        Integer numObj = num; // Autoboxing
        System.out.println("Autoboxed Integer: " + numObj);

        // Unboxing: converting wrapper class back to primitive
        Integer anotherNumObj = 20;
        int anotherNum = anotherNumObj; // Unboxing
        System.out.println("Unboxed int: " + anotherNum);
    }   
}