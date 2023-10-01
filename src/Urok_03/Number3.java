package Urok_03;

public class Number3 {
    public static void main(String[] args) {
        int numberA = 3;
        int numberB = 7;
        int summaOne = ++numberB - numberA;
        int sum = 0;
        do {
            System.out.println("Числа получаются: " + numberA);
            numberA = numberA + 1;
        } while (numberA <= 7);
        System.out.println("Количество этих чисел равно = " + summaOne);
        numberB = numberB + 1;
        numberA = numberA + 1;
    }
}
