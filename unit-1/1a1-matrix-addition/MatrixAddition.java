import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r = s.nextInt();
        System.out.print("Enter the number of columns: ");
        int c = s.nextInt();
        int A[][] = new int[r][c];
        int B[][] = new int[r][c];
        int sum[][] = new int[r][c];

        System.out.println("Enter elements for the first matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                A[i][j] = s.nextInt();

        System.out.println("Enter elements for the second matrix:");
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                B[i][j] = s.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum[i][j] = A[i][j] + B[i][j];

        System.out.println("Sum of the matrices:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++)
                System.out.print(sum[i][j] + " ");
            System.out.println();
        }
        s.close();
    }
}
