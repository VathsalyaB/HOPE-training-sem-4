
package user;
import java.util.*;
import model.*;

public class SupportAgent extends User {
    private List<Ticket> assignedTickets = new ArrayList<>();

    public SupportAgent(int id, String name) {
        super(id, name);
    }

    public void assignTicket(Ticket ticket) {
        if (ticket == null) {
            throw new IllegalArgumentException("Ticket cannot be null");
        }
        assignedTickets.add(ticket);
        ticket.setAssignedAgent(this);
    }

    public void updateTicketStatus(Ticket ticket, Status newStatus) {
        try {
            ticket.setStatus(newStatus);
        } catch (Exception e) {
            System.out.println("Error updating status: " + e.getMessage());
        }
    }

    @Override
    public void viewTickets() {
        for (Ticket t : assignedTickets) {
            System.out.println(t);
        }
    }
}