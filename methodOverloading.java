import java.util.Scanner;
public class methodOverloading 
{
    public static float area(float a)
    {
        return a*a;
    }

    public static float area(float a, float b)
    {
        return a*b;
    }

    public static float area(float a, float b, float h)
    {
        return ((a+b)/2)*h;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int resp;
        float a, b, h, ar=0;
        System.out.println("Enter 1 for area of square");
        System.out.println("Enter 2 for area of rectangle");
        System.out.println("Enter 3 for area of trapezium");
        resp = sc.nextInt();
        switch(resp)
        {            
            case 1:
            a = sc.nextFloat();
            ar = area(a);
            break;
            
            case 2:
            a = sc.nextFloat();
            b = sc.nextFloat();
            ar = area(a, b);
            break;

            case 3:
            a = sc.nextFloat();
            b = sc.nextFloat();
            h = sc.nextFloat();
            ar = area(a, b, h);
            break;
        }
        System.out.println("Area: "+ar);
        sc.close();
    }
}


