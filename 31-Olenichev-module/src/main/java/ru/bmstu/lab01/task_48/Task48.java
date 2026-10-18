package ru.bmstu.lab01.task_48;

import java.util.Scanner;

/**
 * Класс для решения задачи 48: транспонирование квадратной матрицы.
 * <p>
 * Ключевая особенность: транспонирование выполняется на месте (in-place) 
 * за O(1) дополнительной памяти. Обход начинается только по верхнему 
 * треугольнику матрицы, чтобы не менять элементы дважды.
 * </p>
 * 
 * Условие задачи:
 * Вход: квадратная матрица (n x n).
 * Выход: транспонированная матрица.
 * Требование: транспонирование на месте, без создания нового массива.
 * Сложность: средняя.
 */
public class Task48 {

    /**
     * Транспонирует квадратную матрицу на месте (in-place).
     * 
     * @param matrix квадратная матрица размером n x n
     */
    public void transposeInPlace(int[][] matrix) {
        // implement logic
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            
            System.out.println("Введите размер матрицы n:");
            if (!scanner.hasNextInt()) return;
            int n = scanner.nextInt();
            
            int[][] matrix = new int[n][n];
            System.out.println("Введите элементы матрицы (построчно):");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = scanner.nextInt();
                }
            }
            
            Task48 solver = new Task48();
            solver.transposeInPlace(matrix);
            
            System.out.println("Транспонированная матрица:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}