package by.epam.gomel.onlinetrening.array;

import java.util.Arrays;
import java.util.Random;

/*
Дана последовательность целых чисел. Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( , , , ).
 */
public class Task8 {
    public static void main(String[] args) {
        int n = 20; // количество элементов в последовательности
        int maxValue = 5; // максимальное значение элемента в последовательности


        Random random = new Random();
        int [] mass = new int[n];

        //Заполняем массив
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(maxValue);
        }

        System.out.println("Old sequence");
        System.out.println(Arrays.toString(mass));
        System.out.println("New sequence");
        System.out.println(Arrays.toString(createNewSequence(mass)));
    }


    public static int[] createNewSequence(int[] mass){
        if(mass.length == 0 || mass == null){
            return new int[0];
        }

        int countOfMinValue = 1;
        int minValue = mass[0];
        int [] newMass;

        for (int i = 1; i < mass.length; i++) {
            if(mass[i] == minValue){
                countOfMinValue++;
            }

            if(mass[i] < minValue){
                minValue = mass[i];
                countOfMinValue = 1;
            }
        }
        newMass = new int[mass.length-countOfMinValue];
        //Заполняем новый массив
        for (int i = 0, j = 0; i < mass.length; i++) {
            if(mass[i] != minValue){
                newMass[j] = mass[i];
                j++;
            }
        }
        return newMass;
    }
}
