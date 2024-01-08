public class ReverseString {
    public static void main(String[] args) {

        // Reverse a string ?

        //  String does not have a revrse function but stringbuilder does have
        // diff between string and stringbuffer ?
        // do we have reverse function in string ?
        // no

        String s = " ashok";

        // 1. using for loop

        int len = s.length();
        String rev = "";

        for(int i = len - 1 ; i >=0 ; i--) {
        rev += s.charAt(i);
        }
        System.out.println(rev);

        // using String buffer
        StringBuffer sf = new StringBuffer(s);
        System.out.println(sf.reverse());

    }
}