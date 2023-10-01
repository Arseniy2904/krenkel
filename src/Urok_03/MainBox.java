package Urok_03;

import java.util.Scanner;

public class MainBox {
    public static void main(String[] Args) {
        Box box = new Box();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ширину коробки:");
        box.width = scanner.nextDouble();
        System.out.println("Введите высоту коробки:");
        box.height = scanner.nextDouble();
        System.out.println("Введите глубину коробки:");
        box.depth = scanner.nextDouble();
        System.out.println("Объём коробки равен = ");
        box.volume = box.width * box.height * box.depth;
        System.out.println(box.volume);


    }
}
