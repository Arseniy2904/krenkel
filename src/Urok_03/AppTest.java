package Urok_03;

import java.util.Scanner;

public class AppTest {

        public static void main(String[] Args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите первоначальную величину вклада, который хотите взять: ");
            int deposit = scanner.nextInt(); // депозит, который берут
            System.out.println("Укажите, какой годовой процент вы хотите взять");
            int percent = scanner.nextInt(); // под какие проценты
            System.out.println("На какой срок вы хотите его взять");
            int time = scanner.nextInt(); // срок кредитования
            int result = (((deposit / percent))); // сумма процентов в год
            int result1 = ((time / result));
            System.out.println("Сумма с учётом процентов и срока на который вы её взяли составит: " + deposit + result1);

            // Это я от себя! потренироваться и сделать мини приложение побольше!
        }
    }