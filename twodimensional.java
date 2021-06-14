import java.util.Scanner;

public class twodimensional {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number for size of matrix1:");
        int m1 = input.nextInt();
        int m2 = input.nextInt();
        int matrix1[][] = new int[m1][m2];
        System.out.println("enter the elements in the matrix");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < m2; j++) {
                matrix1[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < m2; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("enter the number for size of matrix2:");
        int m3 = input.nextInt();
        int m4 = input.nextInt();
        int matrix2[][] = new int[m3][m4];
        System.out.println("enter the elements in the matrix");
        for (int i = 0; i < m3; i++) {
            for (int j = 0; j < m4; j++) {
                matrix2[i][j] = input.nextInt();
            }
        }
        for (int i = 0; i < m3; i++) {
            for (int j = 0; j < m4; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Addition of two matrix is:");
        int c[][] = new int[matrix1.length][matrix2.length];

        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                c[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
