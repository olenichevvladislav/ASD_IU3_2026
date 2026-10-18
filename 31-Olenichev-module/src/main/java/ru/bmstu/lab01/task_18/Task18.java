package ru.bmstu.lab01.task_18;

import java.util.Scanner;

/**
 * Класс для решения задачи 18: сортировка только чётных элементов.
 * <p>
 * Ключевая особенность: алгоритм находит все чётные числа, собирает их 
 * в отдельный массив, сортирует его методом «пузырька» по невозрастанию 
 * и возвращает на исходные позиции. Нечётные числа остаются нетронутыми.
 * </p>
 * 
 * Условие задачи:
 * Вход: массив из (n) целых чисел.
 * Выход: тот же массив, в котором все чётные элементы отсортированы по невозрастанию, 
 * а нечётные остались на своих местах.
 * Сложность: средняя.
 */
public class Task18 {
    
    /**
     * Сортирует только чётные элементы массива по убыванию.
     * 
     * @param a исходный массив целых чисел
     */
    public void sortEvenDescending(int[] a) {
        // implement logic
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Введите количество элементов:");
            if (!scanner.hasNextInt()) return;
            int n = scanner.nextInt();
            
            int[] arr = new int[n];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            Task18 solver = new Task18();
            solver.sortEvenDescending(arr);
            
            System.out.println("Результат:");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
            
        }
    }
}