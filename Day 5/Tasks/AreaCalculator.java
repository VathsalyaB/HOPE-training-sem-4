import java.util.*;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AreaCalculator calc = new AreaCalculator();

        System.out.println("Enter radius of circle:");
        double r = sc.nextDouble();
        System.out.println("Circle Area: " + calc.area(r));

        System.out.println("\nEnter length and breadth of rectangle:");
        int l = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Rectangle Area: " + calc.area(l, b));

        System.out.println("\nEnter base and height of triangle:");
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        System.out.println("Triangle Area: " + calc.area(base, height));
    }

    public double area(double radius) {
        return Math.PI * radius * radius;
    }
    public int area(int length, int breadth) {
        return length * breadth;
    }
    public double area(double base, double height) {
        return 0.5 * base * height;
    }
}