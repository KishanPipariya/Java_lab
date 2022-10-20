package Unit3;

import java.util.Scanner;

public class MultiCatch {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numerator:");
        int a = sc.nextInt();
        System.out.println("Enter denominator:");
        int b = sc.nextInt();
        System.out.println("Enter the index to be accessed");
        int pointer= sc.nextInt();
        int[] ar = {1,2};
        try{
            System.out.println(a/b);
            System.out.println(ar[pointer]);
            try{
                System.out.println(b/a);
            }
            catch(ArithmeticException e){
                System.out.println(e);
                System.out.println("Incrementing value of denominator by 1");
                a++;
                System.out.println(b/a);
            }
        }
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println("Incrementing value of denominator by 1");
            b++;
            System.out.println(a/b);
            try{
                System.out.println(ar[pointer]);
            }
            catch(ArrayIndexOutOfBoundsException e1){
                System.out.println(e1);
                System.out.println("Setting the value of pointer to maximum permissible value");
                pointer = ar.length-1;
                System.out.println(ar[pointer]);
            }
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            System.out.println("Setting the value of pointer to maximum permissible value");
            pointer = ar.length-1;
            System.out.println(ar[pointer]);
        }
    }
}
