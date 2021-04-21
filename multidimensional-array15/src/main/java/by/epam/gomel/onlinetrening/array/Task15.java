package by.epam.gomel.onlinetrening.array;

import java.util.Random;

/*
Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
 */
public class Task15 {
    public static void main(String[] args) {
        int row = 10;
        int column = 15;
        int maxValue = 100;
        int maxElement = Integer.MIN_VALUE;

        Random random = new Random();
        int [][] mass = new int[row][column];

        System.out.println("Исходная матрица");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(maxValue);
                System.out.print(mass[i][j] + " ");
                if(mass[i][j] > maxElement){
                    maxElement = mass[i][j];
                }
            }
            System.out.println();
        }
        System.out.println("Максимальный элемент матрицы: " + maxElement);
        System.out.println("Измененная матрица");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if(mass[i][j]%2 == 1){
                    System.out.print(maxElement + " ");
                } else {
                    System.out.print(mass[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}
