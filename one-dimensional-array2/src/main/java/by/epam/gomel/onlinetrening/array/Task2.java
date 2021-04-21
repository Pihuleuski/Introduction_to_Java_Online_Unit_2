package by.epam.gomel.onlinetrening.array;

import java.util.Arrays;

/*
Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен.
 */
public class Task2 {

    public static void main(String[] args) {
        int z = 10;
        int [] mass = {1, 13, 7, 19, 16, 3};
        System.out.println(Arrays.toString(mass));
        System.out.println(calculateReplacement(mass, z));
        System.out.println(Arrays.toString(mass));
    }

    public static int calculateReplacement(int [] mass, int z){
        int countOfchanges = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] > z) {
                mass[i] = z;
                countOfchanges++;
            }
        }
        return countOfchanges;
    }
}
