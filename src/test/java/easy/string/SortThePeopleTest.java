package easy.string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortThePeopleTest {
    private final SortThePeople solution = new SortThePeople();

    @Test
    void example1() {
        String[] names = {"Mary", "John", "Emma"};
        int[] heights = {180, 165, 170};
        assertArrayEquals(new String[]{"Mary", "Emma", "John"}, solution.sortPeople(names, heights));
    }

    @Test
    void example2() {
        String[] names = {"Alice", "Bob", "Bob"};
        int[] heights = {155, 185, 150};
        assertArrayEquals(new String[]{"Bob", "Alice", "Bob"}, solution.sortPeople(names, heights));
    }
}