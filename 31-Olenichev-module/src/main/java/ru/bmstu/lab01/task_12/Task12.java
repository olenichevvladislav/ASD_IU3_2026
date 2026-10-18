package ru.bmstu.lab01.task_12;

import java.util.Scanner;

/**
 * Класс для решения задачи 12: поиск пары элементов с заданной суммой.
 * <p>
 * Ключевая особенность: используется перебор всех возможных пар 
 * с помощью двух вложенных циклов. Это гарантирует, что мы найдем пару 
 * с наименьшим первым индексом (i), как того требует условие.
 * </p>
 * 
 * Условие задачи:
 * Вход: массив из n целых чисел и число s.
 * Выход: индексы i &lt; j, для которых a[i] + a[j] == s.
 * Если пар несколько — вывести пару с наименьшим i, при равенстве —
 * с наименьшим j. Если пары нет — вывести "-1 -1".
 * Сложность: средняя.
 */
public class Task12 {

    /** Значение индекса, означающее «пара не найдена». */
    private static final int NOT_FOUND = -1;

     /**
     * Ищет пару индексов (i, j), i &lt; j, с суммой target.
     *
     * <p>Для каждого left перебираем right от left+1 до конца массива.
     * Возрастание left и right обеспечивает, что первая найденная пара
     * имеет минимальный left, а при равном left — минимальный right.
     *
     * @param array  входной массив чисел
     * @param target искомая сумма
     * @return пара индексов или {-1, -1}, если пары нет
     */
    public static int[] findPair(int[] array, long target) {
        int arrayLength = array.length;

        // Внешний цикл перебирает left по возрастанию: первая найденная
        // пара гарантированно имеет минимальный left.
        for (int left = 0; left < arrayLength; left++) {
            int right = left + 1;
            // Внутренний цикл перебирает right от left+1: неравенство
            // left < right и минимальность right при данном left.
            while (right < arrayLength) {
                long sum = (long) array[left] + (long) array[right];
                if (sum == target) {
                    return new int[] {left, right};
                }
                right++;
            }
        }

        return new int[] {NOT_FOUND, NOT_FOUND};
    }

    /**
     * Точка входа: читает длину массива, искомую сумму и сам массив
     * из stdin, печатает пару индексов.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.err.print("Введите длину массива: ");
        int arrayLength = scanner.nextInt();

        System.err.print("Введите искомую сумму: ");
        long targetSum = scanner.nextLong();

        int[] numbers = new int[arrayLength];
        System.err.print("Введите " + arrayLength + " чисел через пробел: ");
        for (int index = 0; index < arrayLength; index++) {
            numbers[index] = scanner.nextInt();
        }

        int[] result = findPair(numbers, targetSum);
        System.out.println(result[0] + " " + result[1]);
    }
}