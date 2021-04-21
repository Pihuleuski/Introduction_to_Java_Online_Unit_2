package by.epam.gomel.onlinetrening.array;

import java.util.Arrays;
import java.util.Random;

/*
Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
 */
public class Task6 {
    public static void main(String[] args) {
        int n = 20;
        int maxValue = 100;

        Random random = new Random();
        int [] mass = new int[n];

        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(maxValue);
        }

        System.out.println(Arrays.toString(mass));

        System.out.println("sum is " + calculateSumOfSimpleNumbers(mass));
    }

    public static int calculateSumOfSimpleNumbers(int [] mass){
        int sum = 0;
        for (int i = 0; i < mass.length; i++) {
            if(isSimple(i)){
                System.out.println(i+1 + " = " + mass[i]);
                sum += mass[i];
            }
        }
        return sum;
    }

    public static boolean isSimple(int number){
        if(number+1 == 1 || number+1 == 2){
            return true;
        }
        for (int i = 2; i < number+1; i++) {
            if((number+1.0)%i == 0 ){
                return false;
            } else {
                return true;
            }
        }
        return false;
    }
}
