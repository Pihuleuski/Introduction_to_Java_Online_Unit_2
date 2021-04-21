package by.epam.gomel.onlinetrening.decomposition;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга,
если сумма его цифр, возведенная в степень n, равна самому числу.
Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
 */
public class Task14 {
    public static void main(String[] args) {
        int k = 10000;
        for (int i = 0; i <=k ; i++) {
            if(isArmstrongNumber(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isArmstrongNumber(int number){
        int countFiguresInNumber;
        int sumFiguresInNumber = 0;
        byte [] array = String.valueOf(number).getBytes();
        countFiguresInNumber = array.length;

        for (int i = 0; i < array.length; i++) {
            sumFiguresInNumber += Character.getNumericValue((char)array[i]);
        }
        if(Math.pow(sumFiguresInNumber, countFiguresInNumber) == number){
            return true;
        } else {
            return false;
        }
    }
}
