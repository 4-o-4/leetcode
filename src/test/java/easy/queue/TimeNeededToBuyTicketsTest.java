package easy.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TimeNeededToBuyTicketsTest {
    private final TimeNeededToBuyTickets test = new TimeNeededToBuyTickets();

    @Test
    void example1() {
        int[] tickets = new int[]{2, 3, 2};
        int k = 2;
        assertEquals(6, test.timeRequiredToBuy(tickets, k));
    }

    @Test
    void example2() {
        int[] tickets = new int[]{5, 1, 1, 1};
        int k = 0;
        assertEquals(8, test.timeRequiredToBuy(tickets, k));
    }
}