package by.epam.gomel.onlinetrening.array;

import java.util.Arrays;

/*
Сортировка выбором. Дана последовательность чисел.Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,5,6,7,8,9};
        System.out.println(Arrays.toString(array));

        sort(array);
    }

    public static void sort(int[] array){
        for (int currentElement = 0; currentElement < array.length; currentElement++) {
            int maxElement = currentElement;
            for (int i = currentElement; i < array.length; i++) {
                if (array[i] > array[maxElement]) {
                    maxElement = i;
                }
            }
            int buf = array[currentElement];
            array[currentElement] = array[maxElement];
            array[maxElement] = buf;
        }
        System.out.println(Arrays.toString(array));
    }
}

