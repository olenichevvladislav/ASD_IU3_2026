package ru.bmstu.lab01.task_58;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Task58Test {
    Task58 solver = new Task58();

    @Test
    public void testSquareMatrix() {
        int[][] expected = {{1, 2}, {4, 3}};
        Assertions.assertArrayEquals(expected, solver.fillSnake(2, 2));
    }

    @Test
    public void testRectangularMatrix() {
        int[][] expected = {{1, 2, 3}, {6, 5, 4}};
        Assertions.assertArrayEquals(expected, solver.fillSnake(2, 3));
    }

    @Test
    public void testSingleRow() {
        int[][] expected = {{1, 2, 3}};
        Assertions.assertArrayEquals(expected, solver.fillSnake(1, 3));
    }
}