package Sugasri_HOPE_Batch_1.DAY_13.VsCode;

import java.util.TreeSet;

public class TreeSetImplementation {
    public static void main(String[] args) {
        TreeSet<String> ts=new TreeSet<>();
        ts.add("Banana");
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Apple");  
        System.out.println("Sorted TreeSet: " +ts);
        System.out.println("First element: " +ts.first());
        System.out.println("Last element: " +ts.last());
    }
}