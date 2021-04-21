package by.epam.gomel.onlinetrening.decomposition;

import static java.lang.Math.*;

/*
На плоскости заданы своими координатами n точек. Написать метод(методы),
определяющие, между какими из пар точек самое большое расстояние.
Указание. Координаты точек занести в массив.
 */
public class Task4 {
    static double distance = Double.MIN_VALUE;
    static double bufDistance = Double.MIN_VALUE;
    static int pointA = 0;
    static int pointB = 1;

    public static void main(String[] args) {
        int [][] arrayXY = {{5,4}, {7,10}, {8,50}, {4, 6},};
        findMaximumDistanceBetweenPoints(arrayXY);
        System.out.println("Максимальная дистанция " + distance + " между точками " + pointA + " и " + pointB);
    }

    public static void findMaximumDistanceBetweenPoints(int [][] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 1; j < array.length; j++) {
                bufDistance = distanceBetweenTwoPoints(array[i], array[j]);
                if(bufDistance > distance){
                    distance = bufDistance;
                    pointA = i;
                    pointB = j;
                }
            }
        }
    }

    public static double distanceBetweenTwoPoints(int[] pointA, int[] pointB){
        return sqrt(pow(pointA[0]-pointB[0], 2) + pow(pointA[1]-pointB[1], 2));
    }
}
