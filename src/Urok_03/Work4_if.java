package Urok_03;

import java.util.Scanner;

public class Work4_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 1;
        if (number1 > 0 && number1 <= 1) {
            System.out.println("Понедельник");
        } else if (number1 > 1 && number1 <= 2) {
            System.out.println("Вторник");
        } else if (number1 > 2 && number1 <= 3) {
            System.out.println("Среда");
        } else if (number1 > 3 && number1 <= 4) {
            System.out.println("Четверг");
        } else if (number1 > 4 && number1 <= 5) {
            System.out.println("Пятница");
        } else if (number1 > 5 && number1 <= 6) {
            System.out.println("Суббота");
        } else if (number1 > 6 && number1 <= 7) {
            System.out.println("Воскресенье");
        } else if (number1 > 7) {
            System.out.println("Больше чем 7, дней недели не существует"); // это я от себя


        }

    }
}
