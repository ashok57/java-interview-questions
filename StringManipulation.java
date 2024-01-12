public class StringManipulation {
    public static void main(String[] args) {
        String str = "The rains have started here";
        String str1 = "The rains have Started here";
        System.out.println(str.length());

        System.out.println(str.charAt(5));

        System.out.println(str.indexOf('s'));

        System.out.println(str.indexOf('s', str.indexOf('s') + 1));

        System.out.println(str.indexOf("have"));

        System.out.println(str.indexOf("hello"));

        System.out.println(str1.equals(str));
        System.out.println(str1.equalsIgnoreCase(str));

        // SubString

        System.out.println(str.substring(0, 15));

        // trim
        String str2 = " Hello World ";
        // three types of spaces are there
        // before spaces
        // between spaces
        // after spaces
        System.out.println(str2.trim());
        // trim removes before spaces and after spaces.

        // Replace:
        System.out.println(str2.replace(" ", ""));

        String date = "01-01-2024";
        System.out.println(date.replace("-", "/"));

        // split:

        String test = "Hello_world_test_java";
        String testVal[] = test.split("_");

        for (int i = 0; i < testVal.length; i++) {
            System.out.print(testVal[i] + " ");
        }
        System.out.println();

        String s3 = "Cares";
        System.out.println(s3.concat("s"));

        String x = "Hello";
        String y = "world";

        int a = 100;
        int b = 200;

        System.out.println(x + y + a + b);
        System.out.println(a + b + x + y);
        System.out.println(x + y + (a + b));

    }
}
