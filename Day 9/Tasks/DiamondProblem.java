interface A {
    default void show() {
        System.out.println("A's show");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B's show");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C's show");
    }
}

class D implements B, C {
    @Override
    public void show() {
        System.out.println("D resolves the conflict");
    }
}

public class DiamondProblem {
    public static void main(String[] args) {
        D obj = new D();
        obj.show();
    }
}