public class StringSwap {
    public static void main(String[] args) {

        // WAP to swap strings using third / temp variable.
        String a = "Hello";
        String b = "World";

        System.out.println("Before Swapping: ");
        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);

        // 1. append a and b:
        a = a + b; // HelloWorld
        System.out.println(a);

        // 2. Store initial string a in String b:

        b = a.substring(0, a.length() - b.length());

        // 3. Store initial String b into String a :

        a = a.substring(b.length());

        System.out.println("the value of a and b after Swapping");

        System.out.println("The value of a: " + a);
        System.out.println("The value of b: " + b);

    }
}
