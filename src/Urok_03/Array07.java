package Urok_03;

public class Array07 {
    public static void main(String[] args) {
        int[] array = {3, 1, 2, 7, 9, 5, 8}; // всего два числа таких
        for (int i = 0; i < array[2]; i++) {
            if (array[2] > 1) {
                System.out.println(" числа 3 и 2 боьше " + array[i]);
            } else {
                for (int j = 1; j < array[3]; j++) {
                    if (array[3] < 2) {
                        System.out.println("Числа 1и 7 больше " + array[3]);
                    }

                }
            }


        }
    }
}
