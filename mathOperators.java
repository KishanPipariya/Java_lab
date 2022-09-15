import java.lang.Math;
import java.util.Scanner;
class mathOperators
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a: "); 
        int a = sc.nextInt();
        System.out.print("Enter value of b: ");
        int b = sc.nextInt();
        System.out.println("a: "+ a);
        System.out.println("b: "+ b);
        System.out.println("a + b: " + (a+b));
        System.out.println("a - b: " + (a-b));
        System.out.println("a * b: " + (a*b));
        System.out.println("a / b: " + (a/b));
        System.out.println("a % b: " + (a%b));
        System.out.println("a^0.5: " + (Math.sqrt(a)));
        System.out.println("a > b: " + (a>b));
        System.out.println("a < b: " + (a<b));
        System.out.println("a >= b: " + (a>=b));
        System.out.println("a <= b: " + (a<=b));
        System.out.println("a != b: " + (a!=b));
        System.out.println("a == b: " + (a==b));
        System.out.println("a>b and b<a: " + ((a>b) && (b<a)));
        System.out.println("a>b or b<a: " + ((a>b) || (b<a)));
        System.out.println("not(a > b): " + !(a>b));
        System.out.println("a++: " + a++);
        System.out.println("a--: " + a--);
        System.out.println("++a: " + ++a);
        System.out.println("--a: " + --a);
        System.out.println("a&b: " + (a&b));
        System.out.println("a|b: " + (a|b));
        System.out.println("a^b: " + (a^b));
        System.out.println("!a: " + ~a);
        System.out.println("a>>b: " + (a>>b));
        System.out.println("a<<b: " + (a<<b));
    }
}
