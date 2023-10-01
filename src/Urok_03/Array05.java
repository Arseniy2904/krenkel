package Urok_03;


public class Array05 {
    public static void main(String[] args) {
        int[] array = {55, 44, 33, 22, 77, 99, 66, 11, 88, 100};
        int min = getMin(array);
        System.out.println(min);
    }

    static int getMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length - 1; i++) {
            if (min > array[i + 1]) {
                min = array[i + 1];
            }

        }
        return min;

    }
}

