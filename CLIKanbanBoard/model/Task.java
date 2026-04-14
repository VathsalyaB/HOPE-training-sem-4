package model;

public class Task {
    private int id;
    private String title;
    private Status status;

    public Task(int id, String title) {
        this.id = id;
        this.title = title;
        this.status = Status.TODO;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}