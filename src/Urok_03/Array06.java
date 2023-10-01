package Urok_03;

import java.util.Arrays;

public class Array06 {
    public static void main(String[] args) {
        int[] array = {7, -5, -9, 6, 4, 2, -1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                System.out.print(array[i] + 1 + "  ");

            }
            if (array[i] > 0) {
                System.out.print(array[i] + "  ");
            }
        }

    }
}
