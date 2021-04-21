package by.epam.gomel.onlinetrening.array;

import java.util.Arrays;

/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента. Если +1  i i a a , то продвигаются
на один элемент вперед. Если +1  i i a a , то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
 */
public class Task6 {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,4,6,7,9,9,3,21,1};
        System.out.println(Arrays.toString(array));

        for (int step = array.length / 2; step > 0; step /= 2) {
            for (int i = step; i < array.length; i++) {
                for (int j = i - step; j >= 0 && array[j] < array[j + step] ; j = j - step) {
                    int x = array[j];
                    array[j] = array[j + step];
                    array[j + step] = x;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
