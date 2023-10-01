package Urok_03;

import java.util.Scanner;

public class Work2_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 4;
        int number2 = 45;
        int number3 = -2;
        int number4 = 8;

        if (number1 > 0) {
            System.out.println("Число " + number1 + " положительное");
        } else {
            System.out.println("Число " + number1 + " отрицатьльное");


        }
        if (number2 > 0) {
            System.out.println("Число " + number2 + " положительное");
        } else {
            System.out.println("Число " + number2 + " отрицатьльное");
        }


        if (number3 < 0) {
            System.out.println("Число " + number3 + " положительное");
        } else {
            System.out.println("Число " + number3 + " положительное");
        }

        if (number4 > 0) {
            System.out.println("Число " + number4 + " положительное");
        } else {
            System.out.println("Число " + number4 + " положительное");
        }

        if (number1 > 0 & number2 > 0 & number3 < 0 & number4 > 0) {
            System.out.println("Итого положительными являются  три числа : " + number1 + "," + number2 + "," + number4);
        } else {
            System.out.println("Итого отрицательным числом является " + number3);

        }


    }

}

