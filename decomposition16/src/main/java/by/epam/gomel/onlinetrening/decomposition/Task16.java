package by.epam.gomel.onlinetrening.decomposition;

/*
Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */
public class Task16 {
    public static void main(String[] args) {
        int n = 4;
        printFindingSequence(n);
    }

    public static void printFindingSequence(int n){
        String sequence = new String();
        int minLimit = findMinLimit(n);
        int maxLimit = findMaxLimit(n);
        int sumOfOddDigits;
        int numberOfEvenDigits;

        for (int i = minLimit; i <= maxLimit; i++) {
            if(isAllNumbersAreOdd(i)){
                sumOfOddDigits = calculateSumOfOddDigits(i);
                numberOfEvenDigits = calculateNumberOfEvenDigits(sumOfOddDigits);
                System.out.println("Число " + i + " имеет сумму цифр " + sumOfOddDigits + ". Сумма имеет " + numberOfEvenDigits + " четных цифр");
            }
        }
    }

    //Метод считает количество четных цифр числа
    public static int calculateNumberOfEvenDigits(int sumOfOddDigits){
        int countOfEvenDigits = 0;

        byte [] byteSequence = String.valueOf(sumOfOddDigits).getBytes();
        for (int i = 0; i < byteSequence.length; i++) {
            if(Character.getNumericValue((char)byteSequence[i])%2 == 0){
                countOfEvenDigits++;
            }
        }
        return countOfEvenDigits;
    }

    //Метод считает сумму всех цифр числа
    public static int calculateSumOfOddDigits(int sequence){
        byte [] byteSequence = String.valueOf(sequence).getBytes();
        int sumOfOddDigits = 0;
        for (int i = 0; i < byteSequence.length; i++) {
            sumOfOddDigits += Character.getNumericValue((char)byteSequence[i]);

        }
        return sumOfOddDigits;
    }

    //Метод проверяет являются ли все цифры числа нечетными
    public static boolean isAllNumbersAreOdd(int sequence){
        byte [] byteSequence = String.valueOf(sequence).getBytes();
        for (int i = 0; i < byteSequence.length; i++) {
            if(Character.getNumericValue((char)byteSequence[i])%2 != 1){
                return false;
            }
        }
        return true;
    }

    //Нижняя граница числа
    public static int findMinLimit(int n){
        String minLimit = "1";
        for (int i = 1; i < n; i++) {
            minLimit += "0";
        }
        return Integer.parseInt(minLimit);
    }

    //Верхняя граница числа
    public static int findMaxLimit(int n){
        String maxLimit = "9";
        for (int i = 1; i < n; i++) {
            maxLimit += "9";
        }
        return Integer.parseInt(maxLimit);
    }
}
