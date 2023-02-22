import java.util.Scanner;

import static java.lang.System.exit;

public class MatrixMul {
    public static void main(String[] args) {
        while (true) {
            System.out.println("Enter the rows and columns of matrix 1");
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println("Enter the rows and columns of matrix 2");
            int p = sc.nextInt();
            int q = sc.nextInt();
            System.out.println("Enter the elemnts of matrix 1");
            int a[][] = new int[20][20];
            for (int i = 0; i < m; i++)
                for (int j = 0; j < n; j++) {
                    a[i][j] = sc.nextInt();
                }
            System.out.println("Enter the elemnts of matrix 2");
            int b[][] = new int[20][20];
            for (int i = 0; i < p; i++)
                for (int j = 0; j < q; j++) {
                    b[i][j] = sc.nextInt();
                }
            System.out.println("Matrix A is");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(" " + a[i][j]);
                }
                System.out.println();
            }
            System.out.println("Matrix B is");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(" " + b[i][j]);
                }
                System.out.println();
            }
            System.out.println("Enter your choice");
            System.out.println("1.Add 2.Sub 3.Mul 4.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    add(m, n, p, q, a, b);
                    break;
                case 2:
                    sub(m, n, p, q, a, b);
                    break;
                case 3:
                    matrix_mul(m, n, p, q, a, b);
                    break;
                case 4:
                    exit(0);
            }

        }
    }
    static void matrix_mul(int m, int n, int p, int q, int a[][], int b[][]) {
        int c[][] = new int[20][20];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                c[i][j] = 0;
                for (int k = 0; k < m; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Resultant matrix  is");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(" " + c[i][j]);
            }
            System.out.println();
        }

    }

    static void add(int m, int n, int p, int q, int a[][], int b[][]) {
        int c[][] = new int[20][20];
        if (m != p || n != q)
            System.out.println("Adddition not possible");
        else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    c[i][j] = a[i][j] + b[i][j];
                }
            }
            System.out.println("Resultant matrix  is");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(" " + c[i][j]);
                }
                System.out.println();
            }

        }
    }
    static void sub(int m, int n, int p, int q, int a[][], int b[][]) {
        int c[][] = new int[20][20];
        if (m != p || n != q)
            System.out.println("Subraction not possible");
        else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    c[i][j] = a[i][j] - b[i][j];
                }
            }
            System.out.println("Resultant matrix  is");
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(" " + c[i][j]);
                }
                System.out.println();
            }

        }
    }
}
