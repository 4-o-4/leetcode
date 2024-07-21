package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountDaysSpentTogetherTest {
    private final CountDaysSpentTogether test = new CountDaysSpentTogether();

    @Test
    void example1() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-16",
                leaveBob = "08-19";
        assertEquals(3, test.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void example2() {
        String arriveAlice = "10-01",
                leaveAlice = "10-31",
                arriveBob = "11-01",
                leaveBob = "12-31";
        assertEquals(0, test.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void example3() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-16",
                leaveBob = "08-18";
        assertEquals(3, test.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void example4() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-12",
                leaveBob = "08-17";
        assertEquals(3, test.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void example5() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-12",
                leaveBob = "08-18";
        assertEquals(4, test.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void example6() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-12",
                leaveBob = "08-15";
        assertEquals(1, test.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void example7() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-12",
                leaveBob = "08-20";
        assertEquals(4, test.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void example8() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-16",
                leaveBob = "08-18";
        assertEquals(3, test.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void example9() {
        String arriveAlice = "09-01",
                leaveAlice = "10-19",
                arriveBob = "06-19",
                leaveBob = "10-20";
        assertEquals(49, test.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void example10() {
        String arriveAlice = "08-02",
                leaveAlice = "08-02",
                arriveBob = "08-02",
                leaveBob = "08-02";
        assertEquals(1, test.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }
}