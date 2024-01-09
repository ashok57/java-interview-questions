import java.util.*;
import java.util.Map.Entry;

public class DuplicateElements {

    public static void main(String[] args) {
        String names[] = { "Java", "C", "Python", "C", "Java" };

        // 1. compare each elements: O(mxn) --worst Solution
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {

                if (names[i].equals(names[j])) {
                    System.out.println("Duplicate elements is : " + names[i]);
                }
            }
            }

            // 2. Using HashSet : Java Collection : it store unique value: O(n)
            Set<String> store = new HashSet<String>();

            for (String name : names) {
                if (!store.add(name)) {
                    System.out.println("Duplicate elements is : " + name);
                }
            }
        //     // 3. Using Hashmap O(2n)
            Map<String, Integer> storeMap = new HashMap<String, Integer>();

            for (String name : names) {
                Integer count = storeMap.get(name);
                if (count == null) {
                    storeMap.put(name, 1);
                } else {
                    storeMap.put(name, ++count);
                }
            }

            // get the values from this HashMap:
            Set<Entry<String, Integer>> entrySet = storeMap.entrySet();
            for (Entry<String, Integer> entry : entrySet) {
                if (entry.getValue() > 1) {
                    System.out.println("Duplicate elements is : " + entry.getKey());
                }
            }
        }
}
