package Urok_03;

public class Main03 {

    public static void main(String[] Args) {
        double p = 3.14; // постоянная
        double s = 17; // площадь окружности
        double D = ((((s) / 4) * p) / 2); // диаметр окружности
        double L = p * D; // длина окружности
        System.out.println("Диаметр окружности равен = " + D + " и длина окружности равна = " + L);
        // НЕ ВЫХОДИТ ПРАВИЛЬНЫЙ ОТВЕТ!!! ПОЧЕМУ-ТО СРЕЗАЕТ ЗНАЧЕНИЯ!!!

    }
}
