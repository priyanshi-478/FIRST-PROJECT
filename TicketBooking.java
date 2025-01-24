public class TicketBooking {
    static int availableSeats = 10;

    public static void bookTicket(int numberOfTickets) {
        if (numberOfTickets <= availableSeats) {
            availableSeats -= numberOfTickets;
            System.out.println("Ticket booked successfully for " + numberOfTickets + " people.");
            System.out.println("Remaining seats: " + availableSeats);
        } else {
            System.out.println("Sorry, not enough seats available.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Booking 3 tickets...");
        bookTicket(3);

        System.out.println("\nBooking 5 tickets...");
        bookTicket(5);

        System.out.println("\nBooking 3 tickets...");
        bookTicket(3);

        // Add the final print statement here
        System.out.println("Priyanshi Agrawal 23SCSE1690056");
    }
}

