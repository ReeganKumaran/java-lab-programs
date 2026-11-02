import java.util.Scanner;

public class LoopExamples {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // 1. FOR LOOP: Print numbers 1 to 5
        System.out.println("Using for loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // 2. WHILE LOOP: Sum of first n numbers
        System.out.print("Enter a number to find sum using while loop: ");
        int n = s.nextInt(), sum = 0, i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println("Sum = " + sum + "\n");

        // 3. DO-WHILE LOOP: Keep asking until password is correct
        String password;
        do {
            System.out.print("Enter password (hint: java): ");
            password = s.next();
        } while (!password.equals("java"));
        System.out.println("Access Granted!\n");

        // 4. ENHANCED FOR LOOP: Print array elements
        int[] marks = {90, 85, 78, 92, 88};
        System.out.println("Student Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }
        s.close();
    }
}
