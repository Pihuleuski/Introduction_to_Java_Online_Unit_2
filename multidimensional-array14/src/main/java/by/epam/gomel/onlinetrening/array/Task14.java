package by.epam.gomel.onlinetrening.array;

import java.util.Random;

/*
Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
единиц равно номеру столбца.
 */
public class Task14 {
    public static void main(String[] args) {
        int m = 0;
        int n = 0;
        int maxMN = 15;

        Random random = new Random();

        do {
            m = random.nextInt(maxMN);
            n = random.nextInt(maxMN);
        }
        while(!((m > n) && (n > 10)));

        int[][] mass = new int[m][n];

        for (int i = 0; i < mass[0].length; i++) {
            int numberOfOne = i;
            int countOfOne = 0;

            for (int j = 0; j < mass.length; j++) {
                if(countOfOne < numberOfOne){
                    mass[j][i] = 1;
                    countOfOne++;
                } else {
                    mass[j][i] = 0;
                }
            }
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
