package by.epam.gomel.onlinetrening.array;

/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
 */
public class Task1 {
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
                if(j != 0 && j % 2 == 1 && mass[0][j] > mass[mass.length-1][j]) {
                    System.out.print(mass[i][j] + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();
        }
    }
}
