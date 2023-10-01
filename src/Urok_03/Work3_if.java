package Urok_03;

import java.util.Scanner;

public class Work3_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 5;
        int number2 = 7;

        if (number1 > 7) {
            System.out.println("Число 5 больше 7");
        } else if (number2 > number1) {
            System.out.println("Число 7 больше 5");
        }

    }
}
