package by.epam.gomel.onlinetrening.array;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 */
public class Task2 {
    public static void main(String[] args) {
        int [][] mass = new int[][]{{1,6,3,7,5},{5,4,3,2,1},{2,4,6,8,1},{8,6,5,4,7},{4,5,3,6,2}};
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if(i==j || i+j==mass.length-1) {
                    System.out.print(mass[i][j] + " ");
                }else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
