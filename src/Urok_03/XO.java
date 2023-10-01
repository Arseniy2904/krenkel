package Urok_03;

import java.util.Arrays;
import java.util.Scanner;

public class XO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, вас приветсвует игра крестики нолики!");
        System.out.println("1. 0\n2. X");
        int[][] matrix = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };
        System.out.print(Arrays.deepToString(matrix));

        System.out.print("Ход игрока номер 1: ");

    }
}
