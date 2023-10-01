package Urok_03;

import java.util.Scanner;

public class Work1_if {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int namberOne = 17;

        if (namberOne > 0) {

            System.out.println("число положительное и оно равно = " + (namberOne + 1));
        } else if (namberOne < 0) {
            System.out.println("число отрицательное и оно равно = " + namberOne);

        }

    }

}
