package Urok_03;

import java.util.Arrays;

public class Matrix02 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15}
        };
        int sum = 0;
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix.length; j++) {
                sum = matrix[i][j] / matrix.length;
                System.out.println(sum);


            }

        }
        System.out.println(sum); //НЕ ПОНИМАЮ КАК ДАЛЬШЕ(
    }
}

