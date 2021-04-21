package by.epam.gomel.onlinetrening.array;

import java.util.Arrays;
import java.util.Random;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
чисел несколько, то определить наименьшее из них.
 */
public class Task9 {
    public static void main(String[] args) {
        int n = 20; // количество элементов в последовательности
        int maxValue = 10; // максимальное значение элемента в последовательности

        Random random = new Random();
        int [] mass = new int[n];

        //Заполняем массив
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(maxValue);
        }

        System.out.println("Old sequence");
        System.out.println(Arrays.toString(mass));

        System.out.println(getMaxPresentNumber(mass));
        System.out.println(getMaxPresentNumber(new int [] {1, 2, 3, 1, 2, 3, 1, 2, 3, 2}));
    }

    public static int getMaxPresentNumber(int [] mass){
        if(mass.length == 0 || mass == null){
            return 0;
        }
        int countFindNumber = 0; //Количество найденного числа в массиве
        int number = Integer.MAX_VALUE; //Число в массиве

        for (int i = 0; i < mass.length; i++) {

            int temporaryCountFindNumber = 0; //Временный счетчик
            int temporaryNumber = mass[i]; //Временное число, встречающееся мах количество раз

            for (int j = 0; j < mass.length; j++) {
                if(mass[j] == temporaryNumber){
                    temporaryCountFindNumber++;
                }
            }
            System.out.println("Число " + temporaryNumber + " - " + "встречается " +temporaryCountFindNumber);

            if(temporaryCountFindNumber > countFindNumber){
                number = temporaryNumber;
                countFindNumber = temporaryCountFindNumber;
            }

            if(temporaryCountFindNumber == countFindNumber){
                number = (number < temporaryNumber) ? number : temporaryNumber;
            }
        }
        return number;
    }
}
