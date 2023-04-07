import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {
        int flightDurationT1 = t1.getTimeTo() - t1.getTimeFrom();
        int flightDurationT2 = t2.getTimeTo() - t2.getTimeFrom();
        return flightDurationT1 - flightDurationT2;
    }
}