package by.epam.gomel.onlinetrening.array;

/*
Пусть даны две неубывающие последовательности действительных чисел.
Требуется указать те места, на которые нужно вставлять элементы последовательности m b  b  b 1 2 в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
 */
public class Task7 {
    public static void main(String[] args) {
        int[] massA = new int[]{3,4,6,7,11,14};
        int[] massB = new int[]{1,2,5,8,9,13,17,19};

        joinSequences(massA, massB);
    }

    public static void joinSequences(int[] massA, int[] massB){

        for (int i = 0; i < massB.length; i++) {
            for (int j = 0; j < massA.length; j++) {
                if(massB[i] <= massA[j]){
                    System.out.println("massB[" + i + "] - " + massB[i] + " необходимо поставить на позицию " + (j));
                    break;
                }else if(j == massA.length-1 && massB[i] > massA[j]){
                    System.out.println("massB[" + i + "] - " + massB[i] + " необходимо поставить на позицию " + (j+1));
                    break;
                }
            }
        }
    }
}
