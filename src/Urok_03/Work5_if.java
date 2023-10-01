package Urok_03;

import java.util.Scanner;

public class Work5_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 5;
        if (number1 > 0 && number1 <= 1) {
            System.out.println("Плохо");
        } else if (number1 > 1 && number1 <= 2) {
            System.out.println("Неудовлетворительно");
        } else if (number1 > 2 && number1 <= 3) {
            System.out.println("Удовлетворительно");
        } else if (number1 > 3 && number1 <= 4) {
            System.out.println("Хорошо");
        } else if (number1 > 4 && number1 <= 5) {
            System.out.println("Отлично");
        } else if (number1 > 5) {
            System.out.println("Число не действительно"); // Это я от себя
        }

    }
}
