package user;
public abstract class User {
    protected int userId;
    protected String name;

    public User(int userId, String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty");
        }
        this.userId = userId;
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public abstract void viewTickets();
}