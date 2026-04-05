package model;

import user.Customer;
import user.SupportAgent;
import java.util.*;

public class Ticket {
    private static int counter = 1;

    private int ticketId;
    private String title;
    private String description;
    private Status status;
    private Priority priority;
    private Customer customer;
    private SupportAgent agent;
    private List<Comment> comments;

    public Ticket(String title, String description, Priority priority, Customer customer) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be empty");
        }
        if (description == null || description.trim().isEmpty()) {
            throw new IllegalArgumentException("Description cannot be empty");
        }

        this.ticketId = counter++;
        this.title = title;
        this.description = description;
        this.priority = priority;
        this.customer = customer;
        this.status = Status.OPEN;
        this.comments = new ArrayList<>();
    }

    public int getTicketId() {
        return ticketId;
    }

    public void setAssignedAgent(SupportAgent agent) {
        this.agent = agent;
    }

    public void setStatus(Status newStatus) {
        if (this.status == Status.RESOLVED && newStatus == Status.OPEN) {
            throw new IllegalStateException("Cannot reopen resolved ticket");
        }
        this.status = newStatus;
    }

    public void addComment(Comment comment) {
        if (comment == null) {
            throw new IllegalArgumentException("Comment cannot be null");
        }
        comments.add(comment);
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId +
                ", Title: " + title +
                ", Status: " + status +
                ", Priority: " + priority +
                ", Customer: " + customer.getName() +
                ", Agent: " + (agent != null ? agent.getName() : "Not Assigned");
    }
}