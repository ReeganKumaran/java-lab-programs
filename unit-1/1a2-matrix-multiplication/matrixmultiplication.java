import java.util.Scanner;

public class matrixmultiplication {
    public static void main(String args[]) {
        int row1, col1, row2, col2;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows in first matrix: ");
        row1 = s.nextInt();
        System.out.print("Enter number of columns in first matrix: ");
        col1 = s.nextInt();
        System.out.print("Enter number of rows in second matrix: ");
        row2 = s.nextInt();
        System.out.print("Enter number of columns in second matrix: ");
        col2 = s.nextInt();

        if (col1 != row2) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }

        int A[][] = new int[row1][col1];
        int B[][] = new int[row2][col2];
        int C[][] = new int[row1][col2];

        System.out.println("\nEnter values for matrix A : ");
        for (int i = 0; i < row1; i++)
            for (int j = 0; j < col1; j++)
                A[i][j] = s.nextInt();

        System.out.println("\nEnter values for matrix B : ");
        for (int i = 0; i < row2; i++)
            for (int j = 0; j < col2; j++)
                B[i][j] = s.nextInt();

        System.out.println("\nMatrix multiplication is : ");
        for (int i = 0; i < row1; i++) {
            for (int j = 0; j < col2; j++) {
                C[i][j] = 0;
                for (int k = 0; k < col1; k++)
                    C[i][j] += A[i][k] * B[k][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
        s.close();
    }
}
