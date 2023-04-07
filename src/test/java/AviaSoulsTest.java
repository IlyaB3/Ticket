import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

class AviaSoulsTest {

    @Test
    public void searchingForAMissingDirection() {
        AviaSouls ticket = new AviaSouls();
        Ticket ticket1 = new Ticket("NYC", "IST", 5500, 21, 15);
        Ticket ticket2 = new Ticket("ATL", "IST", 2500, 13, 10);
        Ticket ticket3 = new Ticket("IST", "MSK", 8500, 17, 20);
        Ticket ticket4 = new Ticket("MSK", "TKY", 6900, 10, 23);
        Ticket ticket5 = new Ticket("NYC", "IST", 9500, 9, 17);
        Ticket ticket6 = new Ticket("IST", "ALN", 11800, 19, 23);
        Ticket ticket7 = new Ticket("SPB", "VRO", 25500, 8, 16);
        Ticket ticket8 = new Ticket("OZP", "ABH", 36700, 6, 10);
        Ticket ticket9 = new Ticket("NYC", "IST", 91200, 23, 17);
        Ticket ticket10 = new Ticket("NYC", "ATL", 95500, 7, 11);
        ticket.add(ticket1);
        ticket.add(ticket2);
        ticket.add(ticket3);
        ticket.add(ticket4);
        ticket.add(ticket5);
        ticket.add(ticket6);
        ticket.add(ticket7);
        ticket.add(ticket8);
        ticket.add(ticket9);
        ticket.add(ticket10);

        Ticket[] expected = {};
        Ticket[] actual = ticket.search("MNK", "IST");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void ticketSearch() {
        AviaSouls ticket = new AviaSouls();
        Ticket ticket1 = new Ticket("NYC", "IST", 5500, 21, 15);
        Ticket ticket2 = new Ticket("ATL", "IST", 2500, 13, 10);
        Ticket ticket3 = new Ticket("IST", "MSK", 8500, 17, 20);
        Ticket ticket4 = new Ticket("MSK", "TKY", 6900, 10, 23);
        Ticket ticket5 = new Ticket("NYC", "IST", 9500, 9, 17);
        Ticket ticket6 = new Ticket("IST", "ALN", 11800, 19, 23);
        Ticket ticket7 = new Ticket("SPB", "VRO", 25500, 8, 16);
        Ticket ticket8 = new Ticket("OZP", "ABH", 36700, 6, 10);
        Ticket ticket9 = new Ticket("NYC", "IST", 91200, 23, 17);
        Ticket ticket10 = new Ticket("NYC", "ATL", 95500, 7, 11);
        ticket.add(ticket1);
        ticket.add(ticket2);
        ticket.add(ticket3);
        ticket.add(ticket4);
        ticket.add(ticket5);
        ticket.add(ticket6);
        ticket.add(ticket7);
        ticket.add(ticket8);
        ticket.add(ticket9);
        ticket.add(ticket10);

        Ticket[] expected = {ticket1, ticket5, ticket9};
        Ticket[] actual = ticket.search("NYC", "IST");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void singleTicketSearch() {
        AviaSouls ticket = new AviaSouls();
        Ticket ticket1 = new Ticket("NYC", "IST", 5500, 21, 15);
        Ticket ticket2 = new Ticket("ATL", "IST", 2500, 13, 10);
        Ticket ticket3 = new Ticket("IST", "MSK", 8500, 17, 20);
        Ticket ticket4 = new Ticket("MSK", "TKY", 6900, 10, 23);
        Ticket ticket5 = new Ticket("NYC", "IST", 9500, 9, 17);
        Ticket ticket6 = new Ticket("MNK", "IST", 11800, 19, 23);
        Ticket ticket7 = new Ticket("SPB", "VRO", 25500, 8, 16);
        Ticket ticket8 = new Ticket("OZP", "ABH", 36700, 6, 10);
        Ticket ticket9 = new Ticket("NYC", "IST", 91200, 23, 17);
        Ticket ticket10 = new Ticket("NYC", "ATL", 95500, 7, 11);
        ticket.add(ticket1);
        ticket.add(ticket2);
        ticket.add(ticket3);
        ticket.add(ticket4);
        ticket.add(ticket5);
        ticket.add(ticket6);
        ticket.add(ticket7);
        ticket.add(ticket8);
        ticket.add(ticket9);
        ticket.add(ticket10);

        Ticket[] expected = {ticket6};
        Ticket[] actual = ticket.search("MNK", "IST");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testTheCompareToMethod() {
        AviaSouls ticket = new AviaSouls();
        Ticket ticket1 = new Ticket("NYC", "IST", 5500, 21, 15);
        Ticket ticket2 = new Ticket("NYC", "IST", 2500, 13, 10);
        Ticket ticket3 = new Ticket("NYC", "IST", 8500, 17, 20);
        Ticket ticket4 = new Ticket("NYC", "IST", 6900, 10, 23);
        Ticket ticket5 = new Ticket("NYC", "IST", 9500, 9, 17);

        ticket.add(ticket1);
        ticket.add(ticket2);
        ticket.add(ticket3);
        ticket.add(ticket4);
        ticket.add(ticket5);

        Ticket[] expected = {ticket2, ticket1, ticket4, ticket3, ticket5};
        Ticket[] actual = ticket.search("NYC", "IST");

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortingTicketsByFlightTime() {
        AviaSouls ticket = new AviaSouls();
        Ticket ticket1 = new Ticket("NYC", "IST", 5500, 10, 15);
        Ticket ticket2 = new Ticket("ATL", "IST", 2500, 13, 10);
        Ticket ticket3 = new Ticket("IST", "MSK", 8500, 17, 20);
        Ticket ticket4 = new Ticket("MSK", "TKY", 6900, 10, 23);
        Ticket ticket5 = new Ticket("NYC", "IST", 9500, 9, 17);
        Ticket ticket6 = new Ticket("MNK", "IST", 11800, 19, 23);
        Ticket ticket7 = new Ticket("NYC", "IST", 25500, 7, 16);
        Ticket ticket8 = new Ticket("OZP", "ABH", 36700, 6, 10);
        Ticket ticket9 = new Ticket("NYC", "IST", 91200, 15, 17);
        Ticket ticket10 = new Ticket("NYC", "ATL", 95500, 7, 11);
        ticket.add(ticket1);
        ticket.add(ticket2);
        ticket.add(ticket3);
        ticket.add(ticket4);
        ticket.add(ticket5);
        ticket.add(ticket6);
        ticket.add(ticket7);
        ticket.add(ticket8);
        ticket.add(ticket9);
        ticket.add(ticket10);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket9, ticket1, ticket5, ticket7};
        Ticket[] actual = ticket.search("NYC", "IST", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }
}