package Urok_03;

import java.util.Scanner;

public class Work6_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number1 = 6.34D;
        var number2 = 2.42D;
        int number3 = 3;
        if (number3 > 0 && number3 <= 1) {
            System.out.println("Результат сложения равен = " + (number1 + number2));
        } else if (number3 > 1 && number3 <= 2) {
            System.out.println("Результат вычитания равен = " + (number1 - number2));
        } else if (number3 > 2 && number3 <= 3) {
            System.out.println("Результат умножения раваен = " + (number1 * number2));
        } else if (number3 > 3 && number3 <= 4) {
            System.out.println("Результат деления равен = " + (number1 / number2));

        }


    }
}
