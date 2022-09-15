import java.util.Scanner;

class matrixMultiplication
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n=0, c=0;
        int r1, r2, c1, c2;
        System.out.println("Enter the number of rows in first matrix:");
        r1 = sc.nextInt();
        System.out.println("Enter the number of columns in first matrix:");
        c1 = sc.nextInt();
        System.out.println("Enter the number of rows in second matrix:");
        r2 = sc.nextInt();
        System.out.println("Enter the number of columns in second matrix:");
        c2 = sc.nextInt();
        if(c1==r2) {
            int ar1[][] = new int[r1][c1];
            int ar2[][] = new int[r2][c2];
            System.out.println("Enter the elements of first matrix");
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    n = sc.nextInt();
                    ar1[i][j] = n;
                }
            }
            System.out.println("Enter the elements of second matrix");
            for (int i = 0; i < r2; i++) {
                for (int j = 0; j < c2; j++) {
                    n = sc.nextInt();
                    ar2[i][j] = n;
                }
            }
            int ans[][] = new int[r1][c2];
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    c = 0;
                    for (int k = 0; k < r2; k++) {
                        c += ar1[i][k] * ar2[k][j];
                    }
                    ans[i][j] = c;
                }
            }
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    System.out.print(ans[i][j] + " ");
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Incompatible matrix");
        }
    }
}

