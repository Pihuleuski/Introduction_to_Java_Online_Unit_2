package by.epam.gomel.onlinetrening.array;

/*
Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
 */
public class Task9 {
    public static void main(String[] args) {
        int [][] mass = new int[][]{{1,2,3,4,5}, {2,3,4,5,6}, {3,4,5,6,7}, {4,5,6,7,8}, {5,6,7,8,9}};
        int numberOfTheColumnWithMaxSum = Integer.MIN_VALUE;
        int sumOfElementsInColumn = Integer.MIN_VALUE;
        int maxSumOfElementsInColumn = Integer.MIN_VALUE;

        for (int i = 0; i < mass[0].length; i++) {
            sumOfElementsInColumn = calculateSumOfColumn(mass, i);
            if(sumOfElementsInColumn > maxSumOfElementsInColumn){
                numberOfTheColumnWithMaxSum = i;
                maxSumOfElementsInColumn = sumOfElementsInColumn;
            }
            System.out.println("Сумма элементов " + i + " столбца равна: " + sumOfElementsInColumn);
        }
        System.out.println("Максимальная сумма " + maxSumOfElementsInColumn + " в столбце номер "
                + numberOfTheColumnWithMaxSum);
    }

    public static int calculateSumOfColumn(int[][] mass, int column){
        int sumOfElementsInColumn = 0;
        if(column < 0 || column >= mass[0].length){
            System.out.println("Не верные параметры");
            return 0;
        }
        for (int i = 0; i < mass.length; i++) {
            sumOfElementsInColumn += mass[i][column];
        }
        return sumOfElementsInColumn;
    }
}
