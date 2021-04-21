package by.epam.gomel.onlinetrening.array;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */
public class Task4 {
    public static void main(String[] args) {
        int n = 8;
        int [][] mass = new int [n][];

        //Создаем двухмерный массив
        for (int i = 0; i < n; i++) {
            mass[i] = new int[n];
            for (int j = 0; j < n; j++) {
                if((i+1)%2 == 1){
                    mass[i][j] = j+1;
                }
                if((i+1)%2 == 0){
                    mass[i][j]=n-j;
                }
            }
        }

        //Выводим массив
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }
}
