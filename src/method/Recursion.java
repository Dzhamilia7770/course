package method;

public class Recursion {
    static void converter(int n) {
        int number;
        number = n % 8;
        if (n >= 2)
            converter(n / 8);
        System.out.print(number);
    }

    public static void main(String[] args) {
        int n = 13;
        converter(n);
    }
}

