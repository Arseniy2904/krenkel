package Urok_03;

public class Number4 {
    public static void main(String[] args) {
        int number = 123;
        int sum = 0;
        int number1 = 123 / 10; //нацело
        int number2 = 123 % 10;//с остатком
        while (number1 >= 12) {
            while (number2 >= 3) {
                System.out.println("При делении на цело получим: " + number1);
                number1 = --number1;
                System.out.println("При делении с остатком получим: " + number2);
                number2 = --number2;
            }
        }
    }
}
