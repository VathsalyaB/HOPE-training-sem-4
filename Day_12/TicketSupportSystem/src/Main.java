import model.*;
import system.*;
import user.*;

public class Main {
    public static void main(String[] args) {

        TicketSystem system = new TicketSystem();

        Customer c1 = new Customer(1, "Joy");
        SupportAgent a1 = new SupportAgent(101, "Yuusuke");

        system.addCustomer(c1);
        system.addAgent(a1);

        try {
            Ticket t1 = system.createTicket(c1, "Login Issue", "Cannot login to account", Priority.HIGH);

            system.assignTicket(t1);

            a1.updateTicketStatus(t1, Status.IN_PROGRESS);

            t1.addComment(new Comment("We are looking into it", "Bob"));

            a1.updateTicketStatus(t1, Status.RESOLVED);

            c1.viewTickets();
            a1.viewTickets();

        } catch (Exception e) {
            System.out.println("System Error: " + e.getMessage());
        }
    }
}