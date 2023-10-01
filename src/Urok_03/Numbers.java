package Urok_03;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 12;
        int number2 = 11;
        int sum = (number1 + number2);
        switch (3) {
            case 1:
                System.out.println("Сумма чисел равна = 21;");
                break;
            case 2:
                System.out.println("Сумма чисел равна = 22;");
                break;
            case 3:
                System.out.println("Сумма чисел равна = 23;");
                break;

        }
        if (number1 > number2) {
            System.out.println("Число 12 > 11; ");
        } else if (number1 > number2) {
            System.out.println("Число 11 больше 12;");

        }


    }
}

