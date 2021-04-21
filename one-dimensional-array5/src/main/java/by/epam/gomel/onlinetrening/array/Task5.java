package by.epam.gomel.onlinetrening.array;

import java.util.Arrays;
import java.util.Random;

/*
Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i
 */
public class Task5 {
    public static void main(String[] args) {
        int n = 1000;
        int maxValue = 100;

        Random random = new Random();
        int [] mass = new int[n];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(maxValue);
        }
        System.out.println(Arrays.toString(mass));
        printMass(mass);
    }

    public static void printMass(int [] mass){
        for (int i = 0; i < mass.length; i++) {
            if(mass[i] > i){
                System.out.println("mass[" + i + "] = " + mass[i]);
            }
        }
    }
}
