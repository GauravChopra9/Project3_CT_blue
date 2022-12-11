// --== CS400 Project Two File Header ==--
// Name: Gaurav Chopra
// CSL Username: chopra
// Email: gmchopra@wisc.edu
// Lecture #: 002 @2:30pm
// Notes to Grader: None

/**
 * This class creates ticket objects that are used by the frontend developer
 */
public class Ticket implements ITicket {
    // Attributes of the ticket objects
    String price;
    String destination;
    String departure;
    String genre;

    /**
     * Constructor which creates the ticket objects
     */
    public Ticket(String price, String departure, String destination) {
        this.price = price;
        this.destination = destination;
        this.departure = departure;
    }

    /**
     * Getter method for the price of the ticket
     */
    @Override
    public String getPrice() {
        return this.price;
    }

    /**
     * Getter method for the destination of the ticket
     */
    @Override
    public String getDestination() {
        return this.destination;
    }

    /**
     * Getter method for the departure of the ticket
     */
    @Override
    public String getDeparture() {
        return this.departure;
    }
}

