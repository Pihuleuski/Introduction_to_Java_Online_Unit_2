package by.epam.gomel.onlinetrening.array;

import java.util.Arrays;

/*
Сортировка вставками. Дана последовательность чисел n . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть i a ,a , ,a 1 2 - упорядоченная последовательность, т. е.
. Берется следующее число i+1 a и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
 */
public class Task5 {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,4,6,6,8,9};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sort(int[] array){
        for (int currentPosition = 0; currentPosition < array.length; currentPosition++) {
            // Вытаскиваем значение элемента
            int value = array[currentPosition];
            // Перемещаемся по элементам, которые перед вытащенным элементом
            int i = currentPosition - 1;
            for (; i >= 0; i--) {
                // Если вытащили значение меньшее — передвигаем больший элемент дальше
                if (value > array[i]) {
                    array[i + 1] = array[i];
                } else {
                    // Если вытащенный элемент больше — останавливаемся
                    break;
                }
            }
            // В освободившееся место вставляем вытащенное значение
            array[i + 1] = value;
        }
    }
}
