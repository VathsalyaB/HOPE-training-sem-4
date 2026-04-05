package user;

import model.*;
import java.util.*;

public class Customer extends User {
    private List<Ticket> tickets = new ArrayList<>();

    public Customer(int id, String name) {
        super(id, name);
    }

    public Ticket createTicket(String title, String description, Priority priority) {
        Ticket ticket = new Ticket(title, description, priority, this);
        tickets.add(ticket);
        return ticket;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    @Override
    public void viewTickets() {
        for (Ticket t : tickets) {
            System.out.println(t);
        }
    }
}