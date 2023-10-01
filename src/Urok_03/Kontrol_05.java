package Urok_03;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Kontrol_05 {
    public static void main(String[] Args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер основания треугольника: ");
        double length = scanner.nextDouble(); // длина основания треугольника
        System.out.println("Введите высоту треугольника: ");
        double height = scanner.nextDouble(); // высота треугольника
        double result = (length * height) * 0.5;
        System.out.println("Площадь треугольника с учётом ваших измерений равна = " + result);

    }
}
