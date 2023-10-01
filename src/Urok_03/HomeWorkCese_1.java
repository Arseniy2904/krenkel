package Urok_03;

import java.util.Scanner;

public class HomeWorkCese_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int radius = 7;
        var P = 3.14D;
        int diameter = (2 * radius);
        var length = (2 * (P * radius));
        var square = (P * radius * 2);
        switch (1) {
            case 1:
                System.out.println("1)Радиус окружности равен = " + radius);
                break;
        }

        switch (1) {
            case 1:
                System.out.println("2)Диаметр окружности равен = " + diameter);
                break;
            case 2:
                System.out.println("Длина окружности равна = ");
                break;
            case 3:
                System.out.println("Площадь окружности равна = ");
                break;
        }
        switch (2) {
            case 1:
                System.out.println("Диаметр окружности равен = ");
                break;
            case 2:
                System.out.println("3)Длина окружности равна = " + length);
                break;
            case 3:
                System.out.println("Площадь окружности равна = ");
                break;
        }
        switch (3) {
            case 1:
                System.out.println("Диаметр окружности равен = ");
                break;
            case 2:
                System.out.println("Длина окружности равна = ");
                break;
            case 3:
                System.out.println("4)Площадь окружности равна = " + square);
                break;

        }


    }
}


