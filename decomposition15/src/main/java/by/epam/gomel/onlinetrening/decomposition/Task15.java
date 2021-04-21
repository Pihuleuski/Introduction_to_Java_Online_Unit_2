package by.epam.gomel.onlinetrening.decomposition;

/*
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
(например, 1234, 5789). Для решения задачи использовать декомпозицию.
 */
public class Task15 {
    public static void main(String[] args) {
        int n = 2;
        printIncreaseSequence(n);
    }

    public static void printIncreaseSequence(int n){
        String sequence = new String();
        int minLimit = findMinLimit(n);
        int maxLimit = findMaxLimit(n);

        for (int i = minLimit; i <= maxLimit; i++) {
            if(isFindingSequence(i)){
                System.out.println(i);
            }
        }
    }

    public static boolean isFindingSequence(int sequence){
        byte [] byteSequence = String.valueOf(sequence).getBytes();
        for (int i = 1; i < byteSequence.length; i++) {
            if(Character.getNumericValue((char)byteSequence[i]) <= Character.getNumericValue((char)byteSequence[i-1])){
                return false;
            }
        }
        return true;
    }

    public static int findMinLimit(int n){
        String minLimit = "1";
        for (int i = 1; i < n; i++) {
            minLimit += "0";
        }
        return Integer.parseInt(minLimit);
    }

    public static int findMaxLimit(int n){
        String maxLimit = "9";
        for (int i = 1; i < n; i++) {
            maxLimit += "9";
        }
        return Integer.parseInt(maxLimit);
    }
}
