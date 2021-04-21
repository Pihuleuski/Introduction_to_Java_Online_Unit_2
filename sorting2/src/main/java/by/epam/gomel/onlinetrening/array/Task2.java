package by.epam.gomel.onlinetrening.array;

import java.util.Arrays;

/*
Даны две последовательности n m. Образовать из них новую последовательность
чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] massA = new int[]{1,3,5,11,13};
        int[] massB = new int[]{2,4,6,8,10};

       joinSequences(massA, massB);
    }

    public static void joinSequences(int[] massA, int[] massB){
        int i = 0;
        int j = 0;

        for (int k = 0; k < massA.length + massB.length; k++) {
            if(i < massA.length && j < massB.length){
                System.out.print((massA[i] < massB[j] ? massA[i++] : massB[j++]) + " ");
            }
            if(i == massA.length && j < massB.length){
                System.out.print(massB[j++] + " ");
            }
            if(j == massB.length && i < massA.length){
                System.out.print(massA[i++] + " ");
            }
        }
    }
}
