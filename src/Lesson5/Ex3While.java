package Lesson5;

import java.util.Arrays;

public class Ex3While {
    public static void main(String[] args) {
        int firstNumberArifm = 1;
        int progressionLimitArifm = 12;
        int differenceArifm = 11;
        int i = 1;

        int[] resultArifm = new int[progressionLimitArifm];
        resultArifm[0] = firstNumberArifm;
        while (i < progressionLimitArifm) {
            resultArifm[i] = resultArifm[i - 1] + differenceArifm;
            i++;
        }
        System.out.println(Arrays.toString(resultArifm));



        int firstNumberGeom = 1;
        int progressionLimitGeom = 12;
        int differenceGeom = 11;
        int i1 = 1;

        int[] resultGeom = new int[progressionLimitGeom];
        resultGeom[0] = firstNumberGeom;
        while (i1 < progressionLimitGeom) {
            resultGeom[i1] = resultGeom[i1 - 1] * differenceGeom;
            i1++;
        }
        System.out.println(Arrays.toString(resultGeom));
    }
}

