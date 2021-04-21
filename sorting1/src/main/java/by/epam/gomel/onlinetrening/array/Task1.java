package by.epam.gomel.onlinetrening.array;

import java.util.Arrays;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
 */
public class Task1 {
    public static void main(String[] args) {
        int[] massA = new int[] {1,2,3,4,5,6,7,8,9};
        int[] massB = new int[] {11,12,13,14,15,16};
        int k = 0;

        System.out.println(Arrays.toString(joinArrays(massA, massB, k)));
        System.out.println(Arrays.toString(joinArraysStandart(massA, massB, k)));
    }

    public static int[] joinArrays(int[] massA, int[] massB, int k){
        if(massA.length < k+1 || k < 0){
            System.out.println("Не возможно объединить");
            return new int[0];
        }
        int[] massC = new int[massA.length + massB.length];
        System.arraycopy(massA, 0, massC, 0, k+1);
        System.arraycopy(massB, 0, massC, k+1, massB.length);
        System.arraycopy(massA, k+1, massC, k+1+massB.length, massC.length-k-1-massB.length);

        return massC;
    }

    public static int[] joinArraysStandart(int[] massA, int[] massB, int k){
        if(massA.length < k+1 || k < 0){
            System.out.println("Не возможно объединить");
            return new int[0];
        }
        int[] massC = new int[massA.length + massB.length];
        for (int i = 0; i < massC.length; i++) {
            if(i <= k){
                massC[i] = massA[i];
            } else if(i > k && i <= massB.length + k){
                massC[i] = massB[i - k - 1];
            } else {
                massC[i] = massA[i - massB.length];
            }
        }
        return massC;
    }
}
