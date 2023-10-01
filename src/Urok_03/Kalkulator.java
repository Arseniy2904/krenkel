package Urok_03;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте, введите первое число");
        int first = scanner.nextInt();
        System.out.println("Введите второе число");
        int second = scanner.nextInt();
        double result = (first / second);
        int result1 = (first * second);
        System.out.println("итоговый результат = " + result);
        System.out.println("Итоговый результат = " + result1);

    }
}
