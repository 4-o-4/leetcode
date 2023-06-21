package easy.string;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountDaysSpentTogetherTest {
    private CountDaysSpentTogether countDaysSpentTogether;

    @BeforeEach
    void init() {
        this.countDaysSpentTogether = new CountDaysSpentTogether();
    }

    @Test
    void countDaysSpentTogetherExample1() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-16",
                leaveBob = "08-19";
        assertEquals(3, countDaysSpentTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void countDaysSpentTogetherExample2() {
        String arriveAlice = "10-01",
                leaveAlice = "10-31",
                arriveBob = "11-01",
                leaveBob = "12-31";
        assertEquals(0, countDaysSpentTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void countDaysSpentTogetherExample3() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-16",
                leaveBob = "08-18";
        assertEquals(3, countDaysSpentTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void countDaysSpentTogetherExample4() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-12",
                leaveBob = "08-17";
        assertEquals(3, countDaysSpentTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void countDaysSpentTogetherExample5() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-12",
                leaveBob = "08-18";
        assertEquals(4, countDaysSpentTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void countDaysSpentTogetherExample6() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-12",
                leaveBob = "08-15";
        assertEquals(1, countDaysSpentTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void countDaysSpentTogetherExample7() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-12",
                leaveBob = "08-20";
        assertEquals(4, countDaysSpentTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void countDaysSpentTogetherExample8() {
        String arriveAlice = "08-15",
                leaveAlice = "08-18",
                arriveBob = "08-16",
                leaveBob = "08-18";
        assertEquals(3, countDaysSpentTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void countDaysSpentTogetherExample9() {
        String arriveAlice = "09-01",
                leaveAlice = "10-19",
                arriveBob = "06-19",
                leaveBob = "10-20";
        assertEquals(49, countDaysSpentTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }

    @Test
    void countDaysSpentTogetherExample10() {
        String arriveAlice = "08-02",
                leaveAlice = "08-02",
                arriveBob = "08-02",
                leaveBob = "08-02";
        assertEquals(1, countDaysSpentTogether.countDaysTogether(arriveAlice, leaveAlice, arriveBob, leaveBob));
    }
}