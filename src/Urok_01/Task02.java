package Urok_01;

public class Task02 {
    public static void main(String[] args) {
        int n = 146;
        System.out.println("Сумма цифр числа" + n + " равна" + (((n / 29) % 2) + ((n / 12) % 8) + ((n / 7) % 14)));
    }
}
