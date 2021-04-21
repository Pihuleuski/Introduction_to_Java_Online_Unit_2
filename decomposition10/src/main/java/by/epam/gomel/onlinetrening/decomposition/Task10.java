package by.epam.gomel.onlinetrening.decomposition;

import java.util.Arrays;
import java.util.Random;

/*
Дано натуральное число N. Написать метод(методы) для формирования массива,
элементами которого являются цифры числа N.
 */
public class Task10 {
    public static void main(String[] args) {
        int n = 12345;
        byte [] numbersOfN = decomposeIntoNumbers(n);
        int [] array = fillInArrayWithNumbers(numbersOfN, 20);
        System.out.println(Arrays.toString(array));
    }

    public static byte[] decomposeIntoNumbers(int n){
        return (""+n).getBytes();
    }

    public static int[] fillInArrayWithNumbers(byte[] numbersOfN, int lengthOfArray){
        Random random = new Random();
        int [] array = new int[lengthOfArray];
        for (int i = 0; i < array.length; i++) {
           array[i] = Character.getNumericValue((char)(numbersOfN[random.nextInt(numbersOfN.length)]));
        }
        return array;
    }
}
