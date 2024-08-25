package easy.queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberOfStudentsUnableToEatLunchTest {
    private final NumberOfStudentsUnableToEatLunch solution = new NumberOfStudentsUnableToEatLunch();

    @Test
    void example1() {
        int[] students = new int[]{1, 1, 0, 0};
        int[] sandwiches = new int[]{0, 1, 0, 1};
        assertEquals(0, solution.countStudents(students, sandwiches));
    }

    @Test
    void example2() {
        int[] students = new int[]{1, 1, 1, 0, 0, 1};
        int[] sandwiches = new int[]{1, 0, 0, 0, 1, 1};
        assertEquals(3, solution.countStudents(students, sandwiches));
    }

    @Test
    void example3() {
        int[] students = new int[]{0, 0, 1, 1, 0, 0, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1};
        int[] sandwiches = new int[]{1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0};
        assertEquals(1, solution.countStudents(students, sandwiches));
    }

    @Test
    void example4() {
        int[] students = new int[]{1, 1, 1, 0, 0, 1};
        int[] sandwiches = new int[]{1, 0, 0, 0, 1, 1};
        assertEquals(3, solution.countStudents(students, sandwiches));
    }
}