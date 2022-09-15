package Unit2;

import java.util.Scanner;

public class raggedArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m, k;
        System.out.print("Enter the number of rows:");
        int n = sc.nextInt();
        int[][] ar = new int[n][];
        int[] ar1 = new int[n];

        for(int i =0; i<n ;i++){
            System.out.print("Enter the number of elements in row-" + (i+1) + ":");
            m = sc.nextInt();
            ar[i] = new int[m];
            ar1[i] = m;
            System.out.println("Enter the elements in the row:");
            for(int j=0; j<m; j++){
                k =sc.nextInt();
                ar[i][j] = k;
            }
        }
        for(int i =0; i<n ;i++){
            for(int j=0; j<ar1[i]; j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
