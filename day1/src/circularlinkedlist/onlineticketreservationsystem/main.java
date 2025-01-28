package circularlinkedlist.onlineticketreservationsystem;

public class main {
    public static void main(String[] args) {
        // Create an instance of the TicketReservationSystem
        TicketReservationSystem reservationSystem = new TicketReservationSystem();

        // Add some tickets with names Sahil, Rahil, Akt, and DK
        reservationSystem.addTicket(101, "Sahil", "Inception", "A1", "10:00 AM");
        reservationSystem.addTicket(102, "Rahil", "Interstellar", "B2", "12:00 PM");
        reservationSystem.addTicket(103, "Akt", "The Dark Knight", "C3", "02:00 PM");
        reservationSystem.addTicket(104, "DK", "Inception", "D4", "04:00 PM");

        // Display all tickets
        System.out.println("\nAll booked tickets:");
        reservationSystem.displayTickets();

        // Search for tickets by Customer Name
        System.out.println("\nSearching for tickets by Customer Name 'Sahil':");
        reservationSystem.searchTicket("Sahil");

        // Search for tickets by Movie Name
        System.out.println("\nSearching for tickets by Movie Name 'Inception':");
        reservationSystem.searchTicket("Inception");

        // Remove a ticket by Ticket ID
        System.out.println("\nRemoving ticket with ID 102:");
        reservationSystem.removeTicket(102);

        // Display remaining tickets
        System.out.println("\nTickets after removal:");
        reservationSystem.displayTickets();

        // Display the total number of booked tickets
        reservationSystem.displayTotalTickets();
    }
}
