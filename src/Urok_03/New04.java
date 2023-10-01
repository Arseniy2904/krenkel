package Urok_03;

public class New04 {
    public static void main(String[] args) {
        String word = "Привет, Александр, с праздником, с Новым Годом";
        System.out.println("Было: " + word);
        String word1 = "пРИВЕТ,";
        String word2 = " аЛЕКСАНДР,";
        String word3 = " С ПРАЗДНИКОМ,";
        String word4 = " С нОВЫМ гОДОМ.";
        String result = word1 + word2 + word3 + word4;
        System.out.println();
        System.out.println("Стало: " + result);

    }
}
