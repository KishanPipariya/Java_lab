package Unit3;

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt();
        b = sc.nextInt();
        try{
            System.out.println(a/0);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }

    }
}
