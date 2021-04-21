package by.epam.gomel.onlinetrening.decomposition;

import java.util.Arrays;

/*
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
 */
public class Task2 {
    public static void main(String[] args) {
        int [] array = {78, 294, 570, 36, 6};

        System.out.println(calculateNODvar1(array));
        System.out.println(calculateNODvar2(array));

    }

    /*
    Независимо от количества чисел, для которых нам нужно найти НОД, мы будем действовать по одному и
    тому же алгоритму, который заключается в последовательном нахождении НОД двух чисел.
    Основан этот алгоритм на применении следующей теоремы: НОД нескольких чиселa1,a2,…,akравен числуdk,
    которое находится при последовательном вычислении НОД(a1,a2)=d2, НОД(d2,a3)=d3, НОД(d3,a4)=d4,…,
    НОД(dk−1,ak)=dk.
     */
    public static int calculateNODvar1(int[] array){
        int nod = 0;
        for (int i = 0; i < array.length; i++) {
            if(i == 0) {
                nod = calculateTwoNumbersNod(array[i], array[i + 1]);
            } else {
                nod = calculateTwoNumbersNod(nod, array[i]);
            }
        }
        return nod;
    }

    public static int calculateTwoNumbersNod(int a, int b){
        if(a <= 0 || b <= 0){
            System.out.println("Введено не натуральное число");
            System.exit(0);
        }
        int twoNumbersNod = 0;
        for (int i = 1; i <= Math.min(a,b); i++) {
            if(a%i == 0 && b%i == 0){
                twoNumbersNod = i;
            }
        }
        return twoNumbersNod;
    }

    public static int calculateNODvar2(int [] array){
        Arrays.sort(array);
        int nod = 1;

        one:for (int i = 1; i <= array[0]; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[j]%i != 0){
                    continue one;
                }
            }
            nod = i;
        }
        return nod;
    }
}
