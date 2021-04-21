package by.epam.gomel.onlinetrening.array;

import java.util.Arrays;
import java.util.Random;

/*
Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы
 */
public class Task4 {

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

        double [] mass1 = {1.0, 2.0, 9.0, 7.0};
        changeMaxAndMinValue(mass1);
        System.out.println(Arrays.toString(mass1));
    }

    public static void changeMaxAndMinValue(double [] mass){
        double maxValue = mass[0];
        double minValue = mass[0];
        int positionOfMaxValue = 0;
        int positionOfMinValue = 0;

        for (int i = 1; i < mass.length; i++) {
            if(maxValue < mass[i]){
                maxValue = mass[i];
                positionOfMaxValue = i;
            }
            if(minValue > mass[i]){
                minValue = mass[i];
                positionOfMinValue = i;
            }
        }
        mass[positionOfMaxValue] = minValue;
        mass[positionOfMinValue] = maxValue;
    }

}
