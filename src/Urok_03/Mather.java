package Urok_03;

import java.util.Scanner;

public class Mather {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Здравствуйте! Добро пожаловать в приложение от Арсения Заровника, которое поможет вам в принятии инсулина) ");
        System.out.println("1.Продолжить\n2.Выйти");
        if (scanner.nextLine().equals("2")) {
            System.out.println("Программа завершина, до свидания!");
            System.exit(0);
        }
        System.out.println("Что вы хотите съесть!");
        System.out.println("1.Мясо молоко крупы? " + "\n2.Низко каллорийные овощи?");
        if (scanner.nextLine().equals("2")) {
            System.out.println("Ешьте на здоровье, инсулин Вам не понадобится!!! " +
                    "Программа завершина, до свидания!");
            System.exit(0);

        }
        System.out.println("Сколько грамм вы хотите трапезничать?");
        


    }

}
