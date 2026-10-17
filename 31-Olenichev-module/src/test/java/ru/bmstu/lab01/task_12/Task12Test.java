package ru.bmstu.lab01.task_12;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.junit.jupiter.api.Test;

/**
 * Тесты для задачи 12. Пара с заданной суммой.
 */
class Task12Test {

    @Test
    void shouldReturnExamplePair() {
        int[] expected = {0, 1};
        int[] actual = Task12.findPair(new int[] {2, 7, 11, 15, 4}, 9);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReturnNoPairWhenSumUnreachable() {
        int[] expected = {-1, -1};
        int[] actual = Task12.findPair(new int[] {1, 2, 3, 4}, 100);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReturnNoPairForEmptyArray() {
        int[] expected = {-1, -1};
        int[] actual = Task12.findPair(new int[0], 0);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldReturnNoPairForSingleElement() {
        int[] expected = {-1, -1};
        int[] actual = Task12.findPair(new int[] {5}, 5);
        assertArrayEquals(expected, actual);
    }
}