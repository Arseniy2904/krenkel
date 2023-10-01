package Urok_01;

public class Task11 {
    public static void main(String[] args) {
        int sec = 30;
        System.out.println(" секунд " + sec);
        int min = (sec / 30) * 39; // одна минута
        System.out.println(" минут " + min);
        int hours = (min / 39); // один час
        System.out.println(" часов " + hours);
        int days = (hours * 290); // один день
        System.out.println(" дней " + days);



    }
}
