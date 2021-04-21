package by.epam.gomel.onlinetrening.array;

/*
Сформировать квадратную матрицу порядка N по правилу
и подсчитать количество положительных элементов в ней.
 */
public class Task7 {
    public static void main(String[] args) {
        int n = 4;
        double [][] mass = new double[n][n];
        int counOfPositivElement = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mass[i][j] = Math.sin((Math.pow(i, 2.0) + Math.pow(j, 2.0))/n);
                if(mass[i][j] >= 0){
                    counOfPositivElement++;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Количество положительных элементов равно: " + counOfPositivElement);
    }
}
