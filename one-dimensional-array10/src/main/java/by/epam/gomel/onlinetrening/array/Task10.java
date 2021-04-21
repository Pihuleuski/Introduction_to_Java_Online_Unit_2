package by.epam.gomel.onlinetrening.array;

import java.util.Arrays;
import java.util.Random;

/*
Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class Task10 {
    public static void main(String[] args) {
        int n = 30; // количество элементов в последовательности
        int maxValue = 100; // максимальное значение элемента в последовательности

        Random random = new Random();
        int [] mass = new int[n];

        //Заполняем массив
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(maxValue);
        }

        System.out.println("Old sequence");
        System.out.println(Arrays.toString(mass));
        changeMas(mass);
        System.out.println("New sequence");
        System.out.println(Arrays.toString(mass));
    }

    public static void changeMas(int [] mass){
        for (int i = 0; i < mass.length; i++) {
            if(i%2.0 == 0){
                mass[i] = 0;
            }
        }
    }
}
