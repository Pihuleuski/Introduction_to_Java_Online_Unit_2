package by.epam.gomel.onlinetrening.array;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Task6 {
    public static void main(String[] args) {
        int n = 12;
        int[][] mass = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(((i <= (n/2-1)) &  ((j-i) >= 0 & (n-j) > i)) | ((i > (n/2-1)) & ((i-j) >= 0) & (i+j >=(n-1)))){
                    mass[i][j] = 1;
                } else {
                    mass[i][j] = 0;
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
