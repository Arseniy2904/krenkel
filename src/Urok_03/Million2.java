package Urok_03;

import java.util.Scanner;

public class Million2 {
    public static void main(String[] args) {
        System.out.println("""
                1)Какая самая большая по площади страна в мире?" +
                                "A:Китай , B:Россия , C:Бразилия , D:Канада
                                   
                               """);
        System.out.println("Ваш ответ: ");
        String Otvet = new Scanner(System.in).next().toUpperCase();
        switch (Otvet) {
            case "A", "C", "D": {
                System.out.println("Это не правильный ответ! К сожалению вы проиграли(" +
                        " Верный ответ был: (B)-Россия!");
                System.out.println("Это были бы следующие вопросы:");
                break;
            }
            case "B": {
                System.out.println("Это правельный ответ, и мы переходим к следующему вопросу");
                System.out.println("-----------------------------------------------------------------------------");
            }
        }
        System.out.println("""
                Какая страна из африки входит в сотав БРИКС?"
                                        "A:Египет , B:ЦАР , C:ЮАР , D:Сомали
                """);
        System.out.println("Ваш ответ: ");
        String Otvet1 = new Scanner(System.in).next().toUpperCase();
        switch (Otvet1) {
            case "A", "B", "D": {
                System.out.println("Ваш ответ оказался не верный, к сожалению мы прощаемся с Вами!" +
                        "Правельный ответ (C)-ЮАР");
                System.out.println("Это были бы следующие вопросы:");
                break;
            }
            case "С": {
                System.out.println("Иии я вас снова поздравляю, так как это правильный ответ!!!" + "Следующий ворос:");
                System.out.println("--------------------------------------------------------------------");
            }
        }
        System.out.println("""
                Самая криминальная страна в мире на 2023 год?
                A:США , B:Венесуэла , C:Камбоджа , D:Индонезия
                """);
        System.out.println("Ваш ответ: ");
        String Otvet2 = new Scanner(System.in).next().toUpperCase();
        switch (Otvet2) {
            case "A", "C", "D": {
                System.out.println("Ваш ответ не верный, мы с вами прощаемся!!!" +
                        "Верный ответ был (B)-Венесуэла!");
                System.out.println("Это были бы следующие вопросы:");
                break;
            }
            case "B": {
                System.out.println("Ваш ответ верный, вы проходите в следующий тур)");
                System.out.println("-------------------------------------------------------");
            }
        }
        System.out.println("""
                В какой стране валюта называется рупий?" +
                                        "A:Великобритания , B:Бутан , C:Сальвадор , D:Австралия
                """);
        System.out.println("Ваш ответ: ");
        String Otvet3 = new Scanner(System.in).next().toUpperCase();
        switch (Otvet3) {
            case "A", "C", "D": {
                System.out.println("Ваш ответ не верный, мы с вами прощаемся!!!" +
                        "Верный ответ был (B)-Бутан");
                System.out.println("Это были бы следующие вопросы:");
                break;
            }
            case "B": {
                System.out.println("Ваш ответ верный, вы проходите в следующий тур. " +
                        "Стоит поднапрячься, ведь за вами последний вопрос: ");
                System.out.println("-----------------------------------------------------------");
            }
        }
        System.out.println("""
                Флаг какой страны имеет форму квадрата?" +
                                        "A:Швейцария , B:Куба , C:Чад , D:Монако
                """);
        System.out.println("Ваш ответ: ");
        String Otvet4 = new Scanner(System.in).next().toUpperCase();
        switch (Otvet4) {
            case "A", "B", "C": {
                System.out.println("Ваш ответ оказался не верный, к сожалению мы прощаемся с Вами! " +
                        "Вы проиграли на последнем вопросе(");
                break;
            }
            case "D": {
                System.out.println("УРААААА, ВЫ ПРОШЛИ ИГРУ!!!!!!!!!!!!!!!!!!!!!!!!!!!!" +
                        "ПОЗДРАВЛЯЮ)))))))))))))");
            }

        }
    }
}

