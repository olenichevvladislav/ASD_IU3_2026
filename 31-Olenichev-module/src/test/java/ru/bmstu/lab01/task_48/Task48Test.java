package ru.bmstu.lab01.task_48;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Task48Test {
    Task48 solver = new Task48();

    @Test
    public void test2x2Matrix() {
        int[][] a = {{1, 2}, {3, 4}};
        int[][] expected = {{1, 3}, {2, 4}};
        solver.transposeInPlace(a);
        Assertions.assertArrayEquals(expected, a);
    }

    @Test
    public void test3x3Matrix() {
        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6}, 
            {7, 8, 9}
        };
        int[][] expected = {
            {1, 4, 7}, 
            {2, 5, 8}, 
            {3, 6, 9}
        };
        solver.transposeInPlace(a);
        Assertions.assertArrayEquals(expected, a);
    }

    @Test
    public void test1x1Matrix() {
        int[][] a = {{42}};
        int[][] expected = {{42}};
        solver.transposeInPlace(a);
        Assertions.assertArrayEquals(expected, a);
    }
    
    @Test
    public void testEmptyMatrix() {
        int[][] a = {};
        int[][] expected = {};
        solver.transposeInPlace(a);
        Assertions.assertArrayEquals(expected, a);
    }
}