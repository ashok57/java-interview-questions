public class DuplicateElements {

    public static void main(String[] args) {
        String names[] = { "Java", "C", "Python", "C" };

        // 1. compare each elements:
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {

                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate elements is : " + names[i]);
                }
            }
        }
    }
}