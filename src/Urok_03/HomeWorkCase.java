package Urok_03;

public class HomeWorkCase {
    public static void main(String[] args) {
        int number1 = 23;
        switch (number1 / 10) {

            case 2:
                System.out.println("Двадцать");
                break;
            case 3:
                System.out.println("Тридцать");
                break;
        }
        switch (number1 % 10) {
            case 1:
                System.out.println("Одно");
                break;
            case 2:
                System.out.println("Два");
                break;
            case 3:
                System.out.println("Три");
                break;
        }
        switch (number1 % 10) {
            case 2:
                System.out.println("учебное");
                break;
            case 3:
                System.out.println("учебных");
                break;
        }
        switch (number1 % 10) {
            case 1:
                System.out.println("задание");
                break;
            case 2:
                System.out.println("заданий");
                break;
            case 3:
                System.out.println("задания");


        }
    }
}
