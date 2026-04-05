package model;
public class Comment {
    private String message;
    private String author;

    public Comment(String message, String author) {
        if (message == null || message.trim().isEmpty()) {
            throw new IllegalArgumentException("Comment cannot be empty");
        }
        this.message = message;
        this.author = author;
    }

    @Override
    public String toString() {
        return author + ": " + message;
    }
}