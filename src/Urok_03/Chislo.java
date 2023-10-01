package Urok_03;

import java.util.Scanner;

public class Chislo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        while (a <= b) {
            System.out.println(a++);
        }

    }
}

