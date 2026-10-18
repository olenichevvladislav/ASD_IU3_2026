package ru.bmstu.lab01.task_18;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class Task18Test {
    Task18 solver = new Task18();

    @Test
    public void testMixedNumbers() {
        // Исходный: 4, 1, 8, 3, 2
        // Четные: 4, 8, 2. По убыванию: 8, 4, 2.
        // Встают на места четных (индексы 0, 2, 4). Нечетные (1, 3) остаются на местах.
        int[] a = {4, 1, 8, 3, 2};
        int[] expected = {8, 1, 4, 3, 2};
        
        solver.sortEvenDescending(a);
        
        Assertions.assertArrayEquals(expected, a);
    }

    @Test
    public void testOnlyEven() {
        // Если все числа четные, они все должны отсортироваться по убыванию
        int[] a = {2, 4, 6, 8};
        int[] expected = {8, 6, 4, 2};
        
        solver.sortEvenDescending(a);
        
        Assertions.assertArrayEquals(expected, a);
    }

     @Test
    public void testOnlyOdd() {
        // Массив без четных чисел. Ничего не должно измениться.
        int[] a = {1, 3, 5, 7};
        int[] expected = {1, 3, 5, 7};
        
        solver.sortEvenDescending(a);
        
        Assertions.assertArrayEquals(expected, a);
    }

    @Test
    public void testEmptyArray() {
        // Without RunningError for empty array.
        int[] a = {};
        int[] expected = {};
        
        solver.sortEvenDescending(a);
        
        Assertions.assertArrayEquals(expected, a);
    }
}