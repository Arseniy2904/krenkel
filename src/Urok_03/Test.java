package Urok_03;

public class Test {
    public static void main(String[] args) {
        int a = 1;
        int n = 9;
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum = sum + a;
            a = a + a * i;
            System.out.println("Значение sum = " + a);

        }

    }
}
