import java.util.Scanner;
class nestedIf
{
    public static void main(String args[])
    {
        int a, b, c, m;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        if (a>=b)
        {
            if (a>=c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        else
        {
            if (b>=c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }
        m = (a>=b)? ((a>=c)? a : c) : ((b>=c)? b : c);
        System.out.println(m);
    }
}
