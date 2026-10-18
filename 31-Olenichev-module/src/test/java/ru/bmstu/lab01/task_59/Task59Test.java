package ru.bmstu.lab01.task_59;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Task59Test {
    Task59 solver = new Task59();

    // Первый простой случай
    @Test
    public void testIdentityMatrix() {
        
        int[][] a = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        Assertions.assertEquals(1, solver.calculateDeterminant(a));
    }

    // Второй простой случай
    @Test
    public void testNullMatrix() {
        Assertions.assertEquals(0, solver.calculateDeterminant(null));
    }

    @Test
    public void testRandomMatrix() {
        // произвольная матрица
        int[][] a = {
            {2, 5, 3}, 
            {1, 8, 4}, 
            {7, 6, 9}
        };
        // Определитель = 41
        Assertions.assertEquals(41, solver.calculateDeterminant(a));
    }

    @Test
    public void testEmptyMatrix() {
        int[][] a = {};
        Assertions.assertEquals(0, solver.calculateDeterminant(a));
    }
}