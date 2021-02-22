/**************************************************************
 * Name        : First Come First Served Tickets
 * Author      : Rumbi Chinhamhora
 * Created     : 2/18/2021
 * Course      : CIS 152 Data Structures
 * Version     : 1.0
 * OS          : Windows 10
 * Language	   : Java
 * Copyright   : This is my own original work based on
 *               specifications issued by our instructor
 * Description : This program overall description here
 *               Input:  list and describe
 *               Output: list and describe
 * Academic Honesty: I attest that this is my original work.
 * I have not used unauthorized source code, either modified or
 * unmodified. I have not given other fellow student(s) access to
 * my program.
 ***************************************************************/

public class TicketSimulatorDriver {
    public static void main( String[] args ) {
        new TicketSimulatorDriver().go();
    }

    private void go() {
        runSimulation(10);
        runSimulation(100);
        runSimulation(1000);
    }

    private void runSimulation(int tickets) {
        TicketSimulator simulation = new TicketSimulator(tickets);
        int customersServed = simulation.runSimulation();
        int ticketsRemaining = simulation.getTickets();
        System.out.printf("%d customers served and %d tickets remain.\n",
            customersServed, ticketsRemaining);
    }

}
