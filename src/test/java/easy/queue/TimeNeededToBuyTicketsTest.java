package easy.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TimeNeededToBuyTicketsTest {
    private TimeNeededToBuyTickets timeNeededToBuyTickets;

    @BeforeEach
    void init() {
        this.timeNeededToBuyTickets = new TimeNeededToBuyTickets();
    }

    @Test
    void timeRequiredToBuyExample1() {
        int[] tickets = new int[]{2, 3, 2};
        int k = 2;
        assertEquals(6, timeNeededToBuyTickets.timeRequiredToBuy(tickets, k));
    }

    @Test
    void timeRequiredToBuyExample2() {
        int[] tickets = new int[]{5, 1, 1, 1};
        int k = 0;
        assertEquals(8, timeNeededToBuyTickets.timeRequiredToBuy(tickets, k));
    }
}