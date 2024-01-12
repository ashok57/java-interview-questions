/**
 * SwapWithoutThird
 */
public class SwapWithoutThird {
    public static void main(String[] args) {
        int x = 5;
        int y = 4;

        // x = 4 and y = 5
        // using third variable
        int t;
        t = x;
        x = y;
        y = t;
        System.out.println(x);
        System.out.println(y);

        // without third variable : using + operator

        x = x + y; // 9
        y = x - y; // 5
        x = x - y; // 4

        System.out.println(x);
        System.out.println(y);

        // without third variable : using * operator

        x = x * y; // 20
        y = x / y; // 20/5
        x = x / y; // 20/4

        System.out.println(x);
        System.out.println(y);

        // without third variable : using XOR(^) operator

        x = x ^ y;
        y = x ^ y;
        x = x ^ y;

        System.out.println(x);
        System.out.println(y);

    }

}