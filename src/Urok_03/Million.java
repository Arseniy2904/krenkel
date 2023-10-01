package Urok_03;

import java.util.Scanner;

public class Million {
    public Million() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String c1 = null;
        String c2 = null;
        String c3 = null;
        String c4 = null;
        String c5 = null;

        String[] b1 = new String[]{"1)Какая самая большая по площади страна в мире?" +
                "\nA:Китай\nB:Россия\nC:Бразилия\nD:Канада",
                "2)Какая страна из африки входит в сотав БРИКС?" +
                        "\nA:Египет\nB:ЦАР\nC:ЮАР\nD:Сомали",
                "3)Самая криминальная страна в мире на 2023 год?" +
                        "\nA:США\nB:Венесуэла\nC:Камбоджа\nD:Индонезия",
                "4)В какой стране валюта называется рупий?" +
                        "\nA:Великобритания\nB:Бутан\nC:Сальвадор\nD:Австралия",
                "5)Флаг какой страны имеет форму квадрата?" +
                        "\nA:Швейцария\nB:Куба\nC:Чад\nD:Монако"};
        int n1 = (int) (Math.random() * b1.length);
        if (n1 == 1) {
            c1 = "A";
            c2 = "A";
            c3 = "A";
            c4 = "A";
            c5 = "Россия";
        }
        if (n1 == 2) {
            c1 = "B";
            c2 = "B";
            c3 = "B";
            c4 = "B";
            c5 = ".ЮАР";
        }
        if (n1 == 3) {
            c1 = "С";
            c2 = "С";
            c3 = "С";
            c4 = "С";
            c5 = "Венесуэла";
        }
        if (n1 == 4) {
            c1 = "D";
            c2 = "D";
            c3 = "D";
            c4 = "D";
            c5 = "Бутан";
        }
        System.out.println();


    }
}
