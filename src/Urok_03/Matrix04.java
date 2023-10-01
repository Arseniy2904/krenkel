package Urok_03;

import javax.xml.parsers.SAXParser;

public class Matrix04 {
    public static void main(String[] args) {
        //Проверить, является ли слово палиндромом (читается в обе стороны)
        String word = "казак";
        System.out.println(checkPalindrom(word));
    }
    public static boolean checkPalindrom(String word) {
        boolean check = true;
        int end = 0;
        for (int i = 0; i < word.length(); i++) {
            char first = word.charAt(i);
            char second = word.charAt(word.length() - 1 - end);
            end++;
            if (first != second) {
                check = false;
                break;
            }
        }
        return check;
    }
}