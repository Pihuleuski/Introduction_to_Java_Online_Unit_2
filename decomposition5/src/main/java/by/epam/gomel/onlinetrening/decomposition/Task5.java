package by.epam.gomel.onlinetrening.decomposition;

import java.util.Arrays;

/*
Составить программу, которая в массиве A[N] находит второе по величине число
(вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 */
public class Task5 {

    public static void main(String[] args) {
        int [] array = {-4, 5, -10, 11, 55, 0, -18, 17};
        System.out.println(findSecondNumber(array.clone()));
        printMaxElement(array.clone());
    }

    public static int findSecondNumber(int [] array){
        Arrays.sort(array);
        return array[1];
    }

    public static void printMaxElement(int[] array){
        Arrays.sort(array);
        System.out.println(array[array.length-2]);
    }
}
