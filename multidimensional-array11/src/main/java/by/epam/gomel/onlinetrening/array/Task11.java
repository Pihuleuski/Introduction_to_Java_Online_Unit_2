package by.epam.gomel.onlinetrening.array;

import java.util.Random;

/*
Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
 */
public class Task11 {
    public static void main(String[] args) {
        int [][] mass = new int [10][20];
        int maxElement = 15;
        Random random = new Random();

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(maxElement);
            }
        }

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        printLineNumber(mass);
    }

    public static void printLineNumber(int [][] mass){

        for (int i = 0; i < mass.length; i++) {
            int countFindFigureFive = 0;

            for (int j = 0; j < mass[i].length; j++) {
                if(mass[i][j] == 5){
                    countFindFigureFive++;
                }
            }
            if(countFindFigureFive >= 3){
                System.out.println("В строке " + i + " цифра 5 встречается " + countFindFigureFive + " раз");
            }
        }
    }
}
