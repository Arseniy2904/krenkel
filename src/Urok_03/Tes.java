package Urok_03;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Tes {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14},
                {16, 71, 81, 94}
        };
        System.out.println(Arrays.deepToString(sortMatrix(matrix)));
        System.out.println(getMiddleElement(matrix));
    }

    static int getMiddleElement(int[][] matrix) {
        int result = 0;
        int[][] resultMatrix = sortMatrix(matrix);
        int k = 0;
        int count = 0;
        int row = 0;
        int col = 0;
        int resultLength = resultMatrix.length * resultMatrix[k].length;
        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                count++;
                if (count == resultLength / 2) {
                    row = i;
                    col = j;
                }
            }
        }
        if (resultLength % 2 != 0) {
            result = resultMatrix[row][col + 1];
        } else {
            int first = resultMatrix[row][col];
            int second = 0;
            if (col != resultMatrix.length - 1) {
                second = resultMatrix[row][col + 1];
            } else {
                second = resultMatrix[row + 1][0];
            }
            result = (first + second) / 2;
        }
        return result;
    }

    private static int[][] sortMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                for (int k = 0; k < matrix.length; k++) {
                    for (int l = 0; l < matrix[k].length; l++) {
                        if (matrix[i][j] < matrix[k][l]) {
                            int temp = matrix[i][j];
                            matrix[i][j] = matrix[k][l];
                            matrix[k][l] = temp;
                        }
                    }
                }
            }
        }
        return matrix;
    }
}


