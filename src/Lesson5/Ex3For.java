package Lesson5;

import java.util.Arrays;

public class Ex3For {
    public static void main(String[] args) {

        int firstNumberArifm = 1;
        int progressionLimitArifm = 12;
        int differenceArifm = 11;
        int[] resultArifm = new int[progressionLimitArifm];
        resultArifm[0] = firstNumberArifm;
        for (int i = 1; i < progressionLimitArifm; i++) {
            resultArifm[i] = resultArifm[i - 1] + differenceArifm;
        }
        System.out.println(Arrays.toString(resultArifm));


        int firstNumberGeom = 1;
        int progressionLimitGeom = 12;
        int differenceGeom = 11;
        int[] resultGeom = new int[progressionLimitGeom];
        resultGeom[0] = firstNumberGeom;
        for (int i = 1; i < progressionLimitGeom; i++) {
            resultGeom[i] = resultGeom[i - 1] * differenceGeom;
        }

        System.out.println(Arrays.toString(resultGeom));

    }
}
