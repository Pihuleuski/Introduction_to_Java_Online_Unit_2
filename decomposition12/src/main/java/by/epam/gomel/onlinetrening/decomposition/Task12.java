package by.epam.gomel.onlinetrening.decomposition;

import java.util.Arrays;

/*
Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 */

/*
РЕШЕНИЕ ОЧЕНЬ НЕ НРАВИТСЯ
 */
public class Task12 {
    public static void main(String[] args) {
        int k = 7;
        int n = 5;
        int [] array = createArray(k, n);
        fillInArray(k, n , array);
        System.out.println(Arrays.toString(array));
    }

    public static int [] createArray(int k, int n){
        int sizeOfArray = 0;
        int bufResult;

        one : for (int i = 1; i <= n ; i++) {
            bufResult = i;
            if(bufResult == k){
                sizeOfArray ++;
                continue one;
            }
            for (int j = 1; j <=n; j++) {
                bufResult = bufResult + j;
                if(bufResult == k){
                    sizeOfArray ++;
                    continue one;
                }
                bufResult = i;
            }
        }
        return new int[sizeOfArray];
    }


    public static void fillInArray(int k, int n , int[] array){
        int positionInArray = 0;
        int bufResult = 0;
        String s = "";

        one : for (int i = 1; i <= n ; i++) {
            bufResult = i;
            s="";
            s += i;
            if(bufResult == k){
                array[positionInArray++] = Integer.parseInt(s);
                continue one;
            }
            for (int j = 1; j <=n; j++) {
                bufResult = bufResult + j;
                s = s + j;
                if(bufResult == k){
                    array[positionInArray++] = Integer.parseInt(s);
                    continue one;
                }
                bufResult = i;
                s="";
                s += i;
            }
        }
    }
}
