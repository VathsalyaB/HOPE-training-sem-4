package system;

import java.util.*;
import user.*;
import model.*;
public class TicketSystem {
    private List<Customer> customers = new ArrayList<>();
    private List<SupportAgent> agents = new ArrayList<>();
    private List<Ticket> tickets = new ArrayList<>();

    public void addCustomer(Customer c) {
        customers.add(c);
    }

    public void addAgent(SupportAgent a) {
        agents.add(a);
    }

    public Ticket createTicket(Customer c, String title, String desc, Priority p) {
        Ticket t = c.createTicket(title, desc, p);
        tickets.add(t);
        return t;
    }

    public void assignTicket(Ticket t) {
        if (agents.isEmpty()) {
            throw new IllegalStateException("No agents available");
        }
        SupportAgent agent = agents.get(0); // simple assignment
        agent.assignTicket(t);
    }
}