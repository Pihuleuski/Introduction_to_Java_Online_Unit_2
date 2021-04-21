package by.epam.gomel.onlinetrening.decomposition;

/*
Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Сумма факториалов равна " + calculateFactorialFromOneToNine());
    }

    public static int calculateFactorialFromOneToNine(){
        int sum = 0;
        for (int i = 1; i <=9 ; i++) {
            if(i%2 == 1){
                sum +=calculateNumberFactorial(i);
                System.out.println("Факториал числа " + i + " равен " + calculateNumberFactorial(i));
            }
        }
        return sum;
    }

    public static int calculateNumberFactorial(int i){
        int resalt;

        if(i == 1) return 1;
        resalt = calculateNumberFactorial(i-1) * i;
        return resalt;
    }
}
