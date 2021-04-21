package by.epam.gomel.onlinetrening.decomposition;

/*
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
натуральных чисел:
 */
public class Task1 {
    public static void main(String[] args) {
        int a = 9;
        int b = 12;
        int nok = a * b / calculateNOD(a, b);
        System.out.println(nok);
    }

    public static int calculateNOD(int a, int b){
        if(a <= 0 || b <= 0){
            System.out.println("Введено не натуральное число");
            System.exit(0);
        }
        int nod = 0;
        for (int i = 1; i <= Math.min(a,b); i++) {
            if(a%i == 0 && b%i == 0){
                nod = i;
            }
        }
        return nod;
    }
}
