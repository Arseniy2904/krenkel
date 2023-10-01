package Urok_03;

public class Array01 {
    public static void main(String[] args) {
        double[] doubles = {12.3, 23.21, 19.65, 43.28, 41.90, 61.42, 35.73, 98.46, 73.45, 21.7};
        double work = 1;
        for (int i = 0; i < doubles.length; i++) {
            work = work * doubles[i];
            System.out.println("Произведение всех этих чисел равно = " + work);

        }
    }
}
