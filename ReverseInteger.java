public class ReverseInteger {
    public static void main(String[] args) {

        // 1. using logic basic
        long num = 12345612; // 54321
        long rev = 0;
        while (num != 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;

        }
        System.out.println("Reverse num is : " + rev);

        // 2. using StringBuffer method

        long num1 = 12345678;
        System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

    }
}
