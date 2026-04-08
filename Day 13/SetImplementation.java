import java.util.*;
public class SetImplementation {
   public static void main(String[] args) {
    Set<Integer> set = new HashSet<>();
    set.add(1);
    set.add(2);
    set.add(3);
    System.out.println(set.contains(1));
    Set<String> set2 = new HashSet<>();
    set2.add("Apple");
    set2.add("Strawberry");
    System.out.println(set2.contains("Apple"));
    System.out.println(set2.contains("Strawberry"));

   }
}
