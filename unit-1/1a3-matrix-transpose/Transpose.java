import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = s.nextInt();
        int A[][] = new int[r][c];

        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = s.nextInt();

        System.out.println("Original Matrix:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(A[i][j] + " ");
            System.out.println();
        }

        // Fixed: the transpose has c rows and r columns,
        // so non-square matrices no longer go out of bounds.
        System.out.println("Transpose of Matrix:");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++)
                System.out.print(A[j][i] + " ");
            System.out.println();
        }
        s.close();
    }
}
