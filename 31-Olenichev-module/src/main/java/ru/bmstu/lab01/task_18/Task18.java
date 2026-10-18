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
        // 1. Считаем количество чётных чисел
        int evenCount = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                evenCount++;
            }
        }

        // Если чётных нет или одно — сортировать нечего
        if (evenCount <= 1) {
            return;
        }

        // 2. Собираем чётные числа в отдельный массив
        int[] evens = new int[evenCount];
        int index = 0;
        for (int num : a) {
            if (num % 2 == 0) {
                evens[index] = num;
                index++;
            }
        }
        
        // 3. Сортируем массив evens по убыванию (пузырьком)
        for (int i = 0; i < evens.length - 1; i++) {
            for (int j = 0; j < evens.length - 1 - i; j++) {
                if (evens[j] < evens[j + 1]) {
                    int temp = evens[j];
                    evens[j] = evens[j + 1];
                    evens[j + 1] = temp;
                }
            }
        }

        // 4. Возвращаем отсортированные чётные на их места
        index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                a[i] = evens[index++];
            }
        }
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