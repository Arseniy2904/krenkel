package Urok_03;

public class Kontrol_04 {
    public static void main(String[] Args) {
        double p = 3.14; //  П постоянная
        int radius1 = 17;// радиус большого круга
        int radius2 = 9;// радиус маленького круга
        double square1 = (p * (radius1 * radius1));// площадь большого круга
        double square2 = (p * (radius2 * radius2));// площадь маленького круга
        double square3 = (square1 - square2);// площадь кольца
        System.out.println("Площадь большого круга равна = " + square1);
        System.out.println("Площадь маленького круга равна = " + square2);
        System.out.println("Площадь кольца равна = " + square3);
    }

}
