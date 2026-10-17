package ru.bmstu.lab01.task_12;

import java.util.Scanner;

/**
 * Задача 12. Пара с заданной суммой.
 *
 * <p>Вход: массив из n целых чисел и число s.
 * Выход: индексы i &lt; j, для которых a[i] + a[j] == s.
 * Если пар несколько — вывести пару с наименьшим i, при равенстве —
 * с наименьшим j. Если пары нет — вывести "-1 -1".
 *
 * <p>Сложность: средняя.
 */
public class Task12 {

    /** Значение индекса, означающее «пара не найдена». */
    private static final int NOT_FOUND = -1;

    /**
     * Ищет пару индексов (i, j), i &lt; j, с суммой target.
     *
     * <p>
     *
     * @param array  входной массив чисел
     * @param target искомая сумма
     * @return пара индексов или {-1, -1}, если пары нет
     */
    public static int[] findPair(int[] array, long target) {
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

        int arrayLength = scanner.nextInt();
        long targetSum = scanner.nextLong();

        int[] numbers = new int[arrayLength];
        for (int index = 0; index < arrayLength; index++) {
            numbers[index] = scanner.nextInt();
        }

        int[] result = findPair(numbers, targetSum);
        System.out.println(result[0] + " " + result[1]);
    }
}