import java.util.Scanner;

public class StudentEvaluation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student marks (0-100): ");
        int marks = scanner.nextInt();

        // 1. IF Statement - Basic check
        if (marks >= 0 && marks <= 100) {
            System.out.println("Valid marks entered.");
        }

        // 2. IF-ELSE - Pass or Fail
        if (marks >= 35) {
            System.out.println("Result: Pass");
        } else {
            System.out.println("Result: Fail");
        }

        // 3. IF-ELSE-IF - Grade Evaluation
        String grade;
        if (marks >= 90) {
            grade = "A+";
        } else if (marks >= 80) {
            grade = "A";
        } else if (marks >= 70) {
            grade = "B";
        } else if (marks >= 60) {
            grade = "C";
        } else if (marks >= 50) {
            grade = "D";
        } else if (marks >= 35) {
            grade = "E";
        } else {
            grade = "F";
        }
        System.out.println("Grade: " + grade);

        // 4. NESTED IF - Check for distinction
        if (marks >= 75) {
            if (marks >= 90) {
                System.out.println("Category: Distinction with Honors");
            } else {
                System.out.println("Category: Distinction");
            }
        }

        // 5. SWITCH - Remarks based on grade
        switch (grade) {
            case "A+":
                System.out.println("Remarks: Excellent Performance!");
                break;
            case "A":
                System.out.println("Remarks: Very Good!");
                break;
            case "B":
                System.out.println("Remarks: Good!");
                break;
            case "C":
                System.out.println("Remarks: Fair.");
                break;
            case "D":
                System.out.println("Remarks: Satisfactory.");
                break;
            case "E":
                System.out.println("Remarks: Needs Improvement.");
                break;
            case "F":
                System.out.println("Remarks: Failed. Better luck next time.");
                break;
            default:
                System.out.println("Remarks: Invalid grade.");
        }
        scanner.close();
    }
}
