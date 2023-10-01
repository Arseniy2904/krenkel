package Urok_03;

import java.util.Arrays;


public class Test01 {
    public static void main(String[] args) {
        int[] array = {4, 67, 32, 9, 12, 77};//4,9,12,32,44,67,77
        int n = 44;
        System.out.println(Arrays.toString(sortArray(array)));
        getResult(array, n);
    }

    private static void getResult(int[] array, int n) {
        int[] resultArray = sortArray(array);
        if (n < resultArray[0]) {
            System.out.println(n);
            printArray(resultArray);
            return;
        } else if (n > resultArray[resultArray.length - 1]) {
            printArray(array);
            System.out.println(n);
            return;
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.println(resultArray[i]);
            if (n > resultArray[i] && n < resultArray[i + 1]) {
                System.out.println(n);
            }
        }
    }

    private static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static int[] sortArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}


