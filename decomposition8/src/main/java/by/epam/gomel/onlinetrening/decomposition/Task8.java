package by.epam.gomel.onlinetrening.decomposition;

/*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов
массива с номерами от k до m.
 */
public class Task8 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6};
        calculateAndPrintSum(array);
    }

    public static void calculateAndPrintSum(int[] array){
        int numberOfFigures = 3;
        for (int i = 0; i < array.length; i++) {
            if(i + numberOfFigures -1 < array.length){
                System.out.println(sumOfThreeNumbers(array, i,i + numberOfFigures -1));
            }
        }
    }

    public static int sumOfThreeNumbers(int[] array, int start, int finish){
        int sum = 0;
        for (int i = start; i <=finish ; i++) {
            sum += array[i];
        }
        return sum;
    }
}
