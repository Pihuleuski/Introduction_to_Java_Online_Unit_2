package by.epam.gomel.onlinetrening.decomposition;

/*
Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 */
public class Task17 {
    static int countOfAddition;

    public static void main(String[] args) {
        int number = 1234512434;
        calculateSumOfDigits(number);
        System.out.println(countOfAddition);
    }

    public static void calculateSumOfDigits(int number){
        byte [] byteDigits = String.valueOf(number).getBytes();
        int countOfDigitsinNumber = byteDigits.length;
        int sum = 0;

        for (int i = 0; i < countOfDigitsinNumber; i++) {
            sum += Character.getNumericValue((char)byteDigits[i]);
        }
        System.out.println("Сумма цифр числа " + number + " равна " + sum);
        countOfAddition++;
        if(sum >=10){
            calculateSumOfDigits(sum);
        }
    }
}
