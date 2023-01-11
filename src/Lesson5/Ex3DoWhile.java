package Lesson5;

import java.util.Arrays;

public class Ex3DoWhile {
    public static void main(String[] args) {

        int firstNumberArifm = 1;
        int progressionLimitArifm = 12;
        int differenceArifm = 11;
        int i = 1;

        int[] resultArifm = new int[progressionLimitArifm];
        resultArifm[0] = firstNumberArifm;

        do {
            resultArifm[i] = resultArifm[i - 1] + differenceArifm;
            i++;

        } while (i < progressionLimitArifm);
        System.out.println(Arrays.toString(resultArifm));


        int firstNumberGeom = 1;
        int progressionLimitGeom = 12;
        int differenceGeom = 11;
        int n = 1;

        int[] resultGeom = new int[progressionLimitGeom];
        resultGeom[0] = firstNumberGeom;
        do {
            resultGeom[n] = resultGeom[n - 1] * differenceGeom;
            n++;
        } while (n < progressionLimitGeom);
        System.out.println(Arrays.toString(resultGeom));
    }
}


