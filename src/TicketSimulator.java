import java.time.Instant;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class TicketSimulator {
    private static final int MAX_TICKETS_PER_CUSTOMER = 4;
    private static final int MAX_CUSTOMERS = 1000;
    Queue<Integer> line;            // Customer line
    Random rnd;                     // Random number generator

    private int tickets;            // Number of tickets to sell

    public TicketSimulator( int tickets ) {
        this.tickets = tickets;
        line = new LinkedList<>();
        rnd = new Random(Instant.now().getEpochSecond());
        createLine();
    }

    private void createLine() {
        int customers = rnd.nextInt(MAX_CUSTOMERS) + 1;
        for ( int i = 0; i < customers; i++ )
            line.add(rnd.nextInt(MAX_TICKETS_PER_CUSTOMER) + 1);
    }

    public int getTickets() {
        return tickets;
    }

    public int runSimulation() {
        int customersServed = 0;
        while(!line.isEmpty()) {
            if (tickets == 0) break;
            int ticketsForThisCustomer = line.poll();
            if (ticketsForThisCustomer <= tickets) {
//                System.out.printf("%d, ", ticketsForThisCustomer);
                customersServed++;
                tickets -= ticketsForThisCustomer;
            }
        }
//        System.out.println();
        return customersServed;
    }
}
