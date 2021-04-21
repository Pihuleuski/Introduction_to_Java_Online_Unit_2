package by.epam.gomel.onlinetrening.array;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Task5 {
    public static void main(String[] args) {
        int n = 8;
        int[][] mass = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i+j >= n){
                    mass[i][j] = 0;
                } else {
                    mass[i][j] = i + 1;
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
