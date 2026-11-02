import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class CollectionsExample {
    public static void main(String[] args) {
        // ArrayList Example
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Apple"); // Duplicate element
        System.out.println("ArrayList:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // HashSet Example
        HashSet<String> uniqueFruits = new HashSet<>(fruits); // Remove duplicates
        System.out.println("\nHashSet:");
        for (String fruit : uniqueFruits) {
            System.out.println(fruit);
        }

        // HashMap Example
        HashMap<String, Integer> fruitCount = new HashMap<>();
        for (String fruit : fruits) {
            fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1); // Count occurrences
        }
        System.out.println("\nHashMap:");
        for (String fruit : fruitCount.keySet()) {
            System.out.println(fruit + ": " + fruitCount.get(fruit));
        }
    }
}
