public class StringOperations {
    public static void main(String[] args) {
        String s1 = " Hello Java ";
        String s2 = "hello";
        System.out.println("String Operations");
        System.out.println("Length: " + s1.length());
        System.out.println("Trimmed: " + s1.trim());
        System.out.println("Uppercase: " + s1.toUpperCase());
        System.out.println("Lowercase: " + s1.toLowerCase());
        System.out.println("Char at 1: " + s1.charAt(1));
        System.out.println("Substring (1 to 5): " + s1.substring(1, 5));
        System.out.println("Equals: " + s1.trim().equals(s2));
        System.out.println("Contains 'Java': " + s1.contains("Java"));
        System.out.println("Replace 'a' with 'x': " + s1.replace('a', 'x'));
        System.out.println("Split by space:");
        for (String word : s1.trim().split(" ")) {
            System.out.println(word);
        }
    }
}
