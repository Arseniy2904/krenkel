package Urok_03;

public class Array03 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 5;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println("Чётные числа: " + array[i]);
                if (array[i] < sum) {
                    array[i]++;
                }

            }
        }
        System.out.println("Количество этих чисел равно = " + sum);
    }
}

