class PrivateExample {
    private void showPrivate() {
        System.out.println("Private method");
    }

    void accessPrivate() {
        showPrivate(); // Allowed inside same class
    }
}

class DefaultExample extends PrivateExample {
    void showDefault() {
        System.out.println("Default method");
    }
}

class ProtectedExample extends DefaultExample {
    protected void showProtected() {
        System.out.println("Protected method");
    }
}

public class PublicExample extends ProtectedExample {
    
    public void showPublic() {
        System.out.println("Public method");
    }

    public static void main(String[] args) {

        // Private class
        PrivateExample p = new PrivateExample();
        p.accessPrivate();  
        // p.showPrivate(); 

        // Default class
        DefaultExample d = new DefaultExample();
        d.showDefault();

        // Protected class
        ProtectedExample pr = new ProtectedExample();
        pr.showProtected();

        // Public class
        PublicExample pub = new PublicExample();
        pub.showPublic();

        // Accessing inherited methods
        pub.showProtected();
        pub.showDefault();
        pub.accessPrivate();
    }
}