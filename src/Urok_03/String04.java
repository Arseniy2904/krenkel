package Urok_03;

import java.util.Arrays;

public class String04 {
    public static void main(String[] args) {
        String stroke = "java323group";
        int lenght = stroke.length() - stroke.replaceAll("\\d+", "").length();
        System.out.println("цифр в строке: " + lenght);

    }
}
