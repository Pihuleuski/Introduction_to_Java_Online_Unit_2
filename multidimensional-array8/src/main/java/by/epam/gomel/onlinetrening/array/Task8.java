package by.epam.gomel.onlinetrening.array;

import java.util.Random;
import java.util.Scanner;

/*
В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
 */
public class Task8 {
    public static void main(String[] args) {
        int numberOfRows;
        int numberOfColumns;
        int columnA;
        int columnB;
        int maxElement = 9;

        int [][] mass;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество строк в матрице");
        numberOfRows = readerOfParametr(scanner);

        System.out.println("Введите количество столбцов в матрице");
        numberOfColumns = readerOfParametr(scanner);

        while (true) {
            System.out.println("Введите первый столбец для замены");
            columnA = readerOfParametr(scanner);
            if(columnA <= numberOfColumns - 1){
                break;
            } else {
                System.out.println("Недопустимый номер столбца");
            }
        }

        while (true) {
            System.out.println("Введите второй столбец для замены");
            columnB = readerOfParametr(scanner);
            if(columnB <= numberOfColumns - 1){
                break;
            } else {
                System.out.println("Недопустимый номер столбца");
            }
        }

        mass = new int[numberOfRows][numberOfColumns];

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                mass[i][j] = random.nextInt(maxElement);
            }
        }

        System.out.println("Исходная матрица");
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }

        changeColumns(mass, columnA, columnB);
        System.out.println();
        System.out.println("Измененная матрица");

        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfColumns; j++) {
                System.out.print(mass[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void changeColumns(int[][] mass, int columnA, int columnB){
        int intermediateValue;

        for (int i = 0; i < mass.length ; i++) {
            intermediateValue = mass[i][columnA];
            mass[i][columnA] = mass[i][columnB];
            mass[i][columnB] = intermediateValue;
        }
    }

    public static int readerOfParametr(Scanner scanner){
        int returnIntValue;
        while (true){
            if(scanner.hasNextInt()){
                if((returnIntValue = scanner.nextInt()) >= 0) {
                    return returnIntValue;
                }
            } else {
                scanner.next();
            }
        }
    }
}
