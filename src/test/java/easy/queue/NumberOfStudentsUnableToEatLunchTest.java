package easy.queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumberOfStudentsUnableToEatLunchTest {
    private NumberOfStudentsUnableToEatLunch numberOfStudentsUnableToEatLunch;

    @BeforeEach
    void init() {
        this.numberOfStudentsUnableToEatLunch = new NumberOfStudentsUnableToEatLunch();
    }

    @Test
    void countStudentsExample1() {
        int[] students = new int[]{1, 1, 0, 0};
        int[] sandwiches = new int[]{0, 1, 0, 1};
        assertEquals(0, numberOfStudentsUnableToEatLunch.countStudents(students, sandwiches));
    }

    @Test
    void countStudentsExample2() {
        int[] students = new int[]{1, 1, 1, 0, 0, 1};
        int[] sandwiches = new int[]{1, 0, 0, 0, 1, 1};
        assertEquals(3, numberOfStudentsUnableToEatLunch.countStudents(students, sandwiches));
    }

    @Test
    void countStudentsExample3() {
        int[] students = new int[]{0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1};
        int[] sandwiches = new int[]{1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0};
        assertEquals(1, numberOfStudentsUnableToEatLunch.countStudents(students, sandwiches));
    }

    @Test
    void countStudentsExample4() {
        int[] students = new int[]{1, 1, 1, 0, 0, 1};
        int[] sandwiches = new int[]{1, 0, 0, 0, 1, 1};
        assertEquals(3, numberOfStudentsUnableToEatLunch.countStudents(students, sandwiches));
    }
}