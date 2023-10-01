package Urok_01;

public class Task10 {
    public static void main(String[] args) {
        int height = 185; // рост тела
        int weight = 80; // вес тела
        int weight1 = 110; // вес тела1
        int a = ((weight * weight1) / height); // оптимальный вес тела при росте 110
        int b = (height - a); // нужно сбросить
        System.out.println("сколько килограмм нужно сбросить (идеальный вес = рост - 110) " + b + " кг нужно сбросить");
    }
}
