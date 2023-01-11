package Lesson5;

import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40};
        int[] array2 = {11, 22, 33, 44, 55};
        int[] sum = new int[5];

        for (int i = 0; i < array2.length; i++) {

            if (i < array1.length) {
                sum[i] = array1[i] + array2[i];
            } else {
                sum[i] = array2[i];
            }
            System.out.println(sum[i]);
        }
    }
}
