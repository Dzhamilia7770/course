package Course;


public class Lesson6 {
    static int[][] getTwoDimArray(int[][] twoDimArray1, int[][] twoDimArray2) {
        int[][] sum = new int[2][2];
        for (int i = 0; i < twoDimArray1.length; i++) {
            for (int j = 0; j < twoDimArray1.length; j++) {
                sum[i][j] = twoDimArray1[i][j] * twoDimArray2[i][j];
            }
        }
        return sum;
    }

    static int getMaxElement(int[][] sum) {
        int maxElement = sum[0][0];
        for (int i = 1; i < sum.length; i++) {
            for (int j = 1; j < sum.length; j++) {
                if (maxElement < sum[i][j]) {
                    maxElement = sum[i][j];
                }
            }
        }
        return maxElement;
    }


    public static void main(String[] args) {
        int[][] twoDimArray1 = {{10, 20}, {30, 40}};
        int[][] twoDimArray2 = {{50, 60}, {70, 80}};
        int[][] result = getTwoDimArray(twoDimArray1, twoDimArray2);

        for (int i = 0; i < twoDimArray1.length; i++) {
            for (int j = 0; j < twoDimArray1.length; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
        int result2 = getMaxElement(result);
        System.out.println("Max element: " + result2);
    }
}



