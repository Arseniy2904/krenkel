package Urok_03;

public class New03 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 1, 2, 3},
                {4, 5, 6, 7}
        };
        int sum = 0;
        for (int i = 0; i <= 0; i++) {
            for (int j = 3; j <= 3; j++) {
                for (int k = 1; k <= 1; k++) {
                    for (int l = 2; l <= 2; l++) {
                        sum = array[i][j] + array[k][l] + array[l][k] + array[j][i];
                        System.out.println("Сумма чисел побочной диагонали матрицы равна = " + sum);
                    }
                }
            }
        }
    }
}
