package by.epam.gomel.onlinetrening.array;

/*
В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Task1 {
    public static void main(String[] args) {
        int k = 3;
        int [] mass = {3, 6, 9, 5, -12};
        System.out.println(calculateSumOfNumbersMas(mass, k));
    }

    public static int calculateSumOfNumbersMas(int [] mass, int k){
        int summOfNumbers = 0;
        if(k == 0 || mass == null){
            return 0;
        }
        for (int i = 0; i < mass.length; i++) {
            if(mass[i]%k == 0){
                summOfNumbers += mass[i];
            }
        }
        return summOfNumbers;
    }
}
