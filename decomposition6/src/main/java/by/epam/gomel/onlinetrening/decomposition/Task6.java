package by.epam.gomel.onlinetrening.decomposition;

import java.util.Arrays;

/*
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
Взаимно простые числа — целые числа, не имеющие никаких общих делителей, кроме ±1. Равносильное определение:
целые числа взаимно просты, если их наибольший общий делитель (НОД) равен 1.
 */
public class Task6 {
    public static void main(String[] args) {
        int [] array = {13, 7, 11};
        System.out.println(checkSimpleNumber(array));
    }
    public static boolean checkSimpleNumber(int [] array){
        return calculateNOD(array) == 1;
    }

    public static int calculateNOD(int [] array){
        Arrays.sort(array);
        int nod = 1;

        one:for (int i = 1; i <= array[0]; i++) {
            for (int j = 0; j < array.length; j++) {
                if(array[j]%i != 0){
                    continue one;
                }
            }
            nod = i;
        }
        return nod;
    }
}
