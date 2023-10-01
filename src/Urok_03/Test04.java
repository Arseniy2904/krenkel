package Urok_03;

import java.util.Arrays;
//
public class Test04 {
    public static void main(String[] args) {
        int[] array = {4, 7, 12, 0, 7, 5, 56, 1, 0};
        int sum = 0;
        System.out.println("Рассматриваемые числа между нулями : ");
        for (int i = 3; i <= 7; i++) {
            if (array[i] > 0) {
                System.out.print(array[i] + ";");
                sum++;
            }
        }
        System.out.println();
        System.out.println("Количество этих чисел между нулями равно:");
        System.out.println(sum + ";");
    }
}

