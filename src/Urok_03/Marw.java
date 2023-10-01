package Urok_03;

public class Marw {
    public class Main {
        public static void main(String[] args) {
            int[] array = {3, 167, 9, 88, 1, 98};
            System.out.println(getSecondMax(array));

        }

        private static int getSecondMax(int[] array) {
            int maxNum = getMaxNum(array);
            swap(array, 0, maxNum);
            int secondMax = 0;
            for (int i = 1; i < array.length; i++) {
                if (secondMax < array[i]) {
                    secondMax = array[i];
                }
            }
            return secondMax;
        }

        private static int getMaxNum(int[] array) {
            int max = array[0];
            int maxNum = 0;
            for (int i = 0; i < array.length; i++) {
                if (max < array[i]) {
                    max = array[i];
                    maxNum = i;
                }
            }
            return maxNum;
        }

        private static void swap(int[] array, int first, int second) {
            int temp = array[first];
            array[first] = array[second];
            array[second] = temp;
        }
    }
}
