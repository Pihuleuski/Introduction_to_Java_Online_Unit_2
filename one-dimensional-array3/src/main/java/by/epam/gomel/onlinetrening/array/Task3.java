package by.epam.gomel.onlinetrening.array;

import java.util.Random;

/*
Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.
 */
public class Task3 {
    public static void main(String[] args) {
        int n = 1_000_000;
        int maxValue = 10;
        int minValue = -10;

        Random random = new Random();
        double [] mass = new double[n];

        for (int i = 0; i < mass.length; i++) {
            double currentValue;
            currentValue = random.nextDouble()*(random.nextInt(maxValue - minValue) + minValue);
            mass[i] = (Math.abs(currentValue) <= 0.01) ? 0 : currentValue;
        }

        System.out.println(calculateArraysParameters(mass).toString());
    }

    public static Parametr calculateArraysParameters(double [] mass){
        int numberOfPositiveElements = 0;
        int numberOfNegativeElements = 0;
        int numberOfNullElements = 0;

        for (int i = 0; i < mass.length; i++) {
            if(mass[i] > 0){
                numberOfPositiveElements++;
            } else if (mass[i] < 0){
                numberOfNegativeElements++;
            }else{
                numberOfNullElements++;
            }
        }
        return new Parametr(numberOfPositiveElements, numberOfNegativeElements, numberOfNullElements);
    }
}
