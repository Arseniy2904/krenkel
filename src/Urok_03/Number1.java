package Urok_03;

import java.util.Scanner;

public class Number1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1; //само число
        int olt = 1;//попытка факториал
        int sum = 0;
        do {
            System.out.println("Введите число : ");
            number1 = scanner.nextInt();
            System.out.println("Факториал числа " + number1 + " равен = " + (olt+1));

        } while (number1 > 0);
        olt = olt + 1;// НЕ ПОЛУЧАЕТСЯ


    }
}
