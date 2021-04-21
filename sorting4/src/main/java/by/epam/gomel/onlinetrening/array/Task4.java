package by.epam.gomel.onlinetrening.array;

import java.util.Arrays;

/*
Сортировка обменами. Дана последовательность чисел.Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа 1+i i a и a . Если 1+  i i a a , то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 */
public class Task4 {
    public static void main(String[] args) {

        int[] array = {1,2,3,3,4,4,5,6,6,6,7,9};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array){
        int countOfChanges = 0;
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] > array[i - 1]) {
                    swap(array, i, i-1);
                    countOfChanges++;
                    needIteration = true;
                }
            }
        }
        System.out.println("Количество перестановок " + countOfChanges);;
    }

    public static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }
}
