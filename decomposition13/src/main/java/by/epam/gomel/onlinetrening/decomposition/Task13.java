package by.epam.gomel.onlinetrening.decomposition;

/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2
(например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n],
где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 */
public class Task13 {
    public static void main(String[] args) {
        int n = 10;
        printPairs(n);
    }

    public static void printPairs(int n){
        int differenceOfNumber = 2;
        for (int i = n; i <= 2*n-differenceOfNumber; i++) {
            System.out.println(i + " - " + (i+2));
        }
    }
}
