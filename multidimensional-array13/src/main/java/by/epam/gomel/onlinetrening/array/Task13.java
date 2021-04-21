package by.epam.gomel.onlinetrening.array;

import java.util.Random;

/*
Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 */
public class Task13 {
    public static void main(String[] args) {
        int [][] mass = new int [5][10];
        int maxElement = 9;
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(maxElement);
            }
        }

        System.out.println("Исходная матрица");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        sortByAscendingOrder(mass);

        System.out.println("Отсортированная по возрастанию матрица");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        sortByDescendingOrder(mass);

        System.out.println("Отсортированная по убыванию матрица");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }

    //Сортировка по убыванию
    public static void sortByDescendingOrder(int [][] mass){
        for (int i = 0; i < mass[0].length; i++) {

            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int j = mass.length-1; j > 0; j--) {
                    if(mass[j][i] > mass[j-1][i]){
                        isSorted = false;

                        buf = mass[j][i];
                        mass[j][i] = mass[j-1][i];
                        mass[j-1][i] = buf;
                    }
                }
            }
        }
    }
    //Сортировка по возрастанию
    public static void sortByAscendingOrder(int [][] mass){
        for (int i = 0; i < mass[0].length; i++) {

            boolean isSorted = false;
            int buf;
            while(!isSorted) {
                isSorted = true;
                for (int j = 0; j < mass.length-1; j++) {
                    if(mass[j][i] > mass[j+1][i]){
                        isSorted = false;

                        buf = mass[j][i];
                        mass[j][i] = mass[j+1][i];
                        mass[j+1][i] = buf;
                    }
                }
            }
        }
    }
}