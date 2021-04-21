package by.epam.gomel.onlinetrening.array;

/*
Найти положительные элементы главной диагонали квадратной матрицы.
 */
public class Task10 {
    public static void main(String[] args) {
        int [][] mass = new int[][]{{-1,2,3,4,5},{2,3,4,5,6},{3,4,5,6,7},{4,5,6,7,8},{5,6,7,8,9}};

        System.out.println("Исходная матрица");
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if(mass[i][j] >= 0 & i == j || i+j == mass.length-1){
                    System.out.print(mass[i][j] + " ");
                }
                else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if(mass[i][j] >= 0 & i == j || i+j == mass.length-1){
                    System.out.println("Элемент " + mass[i][j] + " находится на позиции " + "[" + i + "][" + j + "]");
                }
            }
        }
    }
}
