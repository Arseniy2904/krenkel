package Urok_03;

public class Number6 {
    public static void main(String[] args) {
        int number1 = 350;// количество первоначального вклада
        double prosent = 24.5;// сколько процентов налетело с одного месяца
        int month = 9; // количество месяцев
        int sum = 0;
        while (sum < 1) {
            sum++;
            double prosent9 = (month * prosent); //проценты за 9 месяцев
            double nextMonth = (number1 + prosent9);//цена с процентами за 9 месяцев
            System.out.println("Итого с процентами он должен заплатить: " + nextMonth + " руб.");
        }
    }
}
