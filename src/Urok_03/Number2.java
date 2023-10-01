package Urok_03;

public class Number2 {
    public static void main(String[] args) {
        int prise = 300;// Цена за один килограмм конфет
        int kilo = 1;// сколько килограммов
        double sum = 0;
        while (prise < 3000) {
            while (kilo <= 10) {
                System.out.println("Цена конфет " + kilo + " кг равна = " + prise * kilo + "руб.");
                kilo = kilo + 1;
            }
        }
        sum = kilo * prise;
    }
}
