package ru.bmstu.lab01.task_47;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Task47Test {
    Task47 solver = new Task47();

    @Test
    public void testSquareMatrix() {
        // Матрица 2x2
        // 1 2
        // 3 4
        // После поворота:
        // 3 1
        // 4 2
        int[][] a = {{1, 2}, {3, 4}};
        int[][] expected = {{3, 1}, {4, 2}};
        Assertions.assertArrayEquals(expected, solver.rotate90(a));
    }

    @Test
    public void testRectangularMatrix() {
        // Матрица 2x3
        // 1 2 3
        // 4 5 6
        // После поворота должна стать 3x2:
        // 4 1
        // 5 2
        // 6 3
        int[][] a = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{4, 1}, {5, 2}, {6, 3}};
        Assertions.assertArrayEquals(expected, solver.rotate90(a));
    }

     @Test
    public void testSingleRow() {
        // Матрица 1x3
        // 1 2 3
        // После поворота станет 3x1:
        // 1
        // 2
        // 3
        int[][] a = {{1, 2, 3}};
        int[][] expected = {{1}, {2}, {3}};
        Assertions.assertArrayEquals(expected, solver.rotate90(a));
    }

    @Test
    public void testEmptyMatrix() {
        int[][] a = {};
        int[][] expected = {};
        Assertions.assertArrayEquals(expected, solver.rotate90(a));
    }
}