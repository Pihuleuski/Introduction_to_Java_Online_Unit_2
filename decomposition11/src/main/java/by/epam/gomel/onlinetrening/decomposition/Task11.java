package by.epam.gomel.onlinetrening.decomposition;

/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 */
public class Task11 {
    public static void main(String[] args) {
        int figureA = 122332211;
        int figureB = 34311;

        int numberOfFigureA = returnNumberOfFigures(figureA);
        int numberOfFigureB = returnNumberOfFigures(figureB);
        System.out.println(numberOfFigureA);
        System.out.println(numberOfFigureB);
        printNumberWithLargeNumberOfFigures(numberOfFigureA, numberOfFigureB);


        numberOfFigureA = returnNumberOfDifferentFigures(figureA);
        numberOfFigureB = returnNumberOfDifferentFigures(figureB);
        System.out.println(numberOfFigureA);
        System.out.println(numberOfFigureB);
        printNumberWithLargeNumberOfFigures(numberOfFigureA, numberOfFigureB);
    }

    public static int returnNumberOfFigures(int figure){
        return String.valueOf(figure).getBytes().length;
    }

    public static int returnNumberOfDifferentFigures(int figure){
        byte[] array = String.valueOf(figure).getBytes();
        int countOfDifferentFigures = 1;
        one:for (int i = 0; i < array.length-1 ; i++) {
            for (int j = i+1; j < array.length; j++) {
                if(array[i] == array[j]){
                    continue one;
                }
            }
            countOfDifferentFigures++;
        }
        return countOfDifferentFigures;
    }

    public static void printNumberWithLargeNumberOfFigures(int numberOfFigureA, int numberOfFigureB){
        if(numberOfFigureA > numberOfFigureB){
            System.out.println("В первом числе цифр больше");
        } else if (numberOfFigureA < numberOfFigureB){
            System.out.println("Во втором числе цифр больше");
        } else {
            System.out.println("В числах одинаковое количество цифр");
        }
    }
}
