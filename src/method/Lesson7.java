package method;


public class Lesson7 {
    static void add(int startCounter, int endCounter) {

        for (int i = startCounter; i <= endCounter; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    static void add(double startCounter, double endCounter) {
        for (int i = (int) startCounter; i <= endCounter; i++) {
            if (i % 2 == 0) {
                System.out.println((double) i);
            }
        }
    }

    public static void main(String[] args) {
        add(2, 100);
        add(2.4, 44.4);
    }
}
