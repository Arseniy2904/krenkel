package Urok_03;

public class Array02 {
    public static void main(String[] args) {
        int[] array = {4, 3, 7, 12, 98, 76, 54, 3};
        double sum = 0;
        double sum1 = 0;
        for (int i = 0; i < array.length; i++) {
            sum = (sum + array[i]);
            sum1 = (sum / 8);
            System.out.println("Среднее арифметичкское чисел  " + sum1);


        }
        System.out.println();
        System.out.println("Окончательный ответ: среднее арифметическое чисел равно = " + sum1);
    }
}
