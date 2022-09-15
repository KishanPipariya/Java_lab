package Unit1;

import java.lang.Math;

public class passByValue {
    private int p=10;
    public int q=10;
    int r=10;
    protected int s=10;
    public static void swap(int a, int b){
        int t;
        t = a;
        a = b;
        b = t;
        System.out.println("a: " + a + "\nb: "+b);
    }

    public static double area(double r){
        return 3.14 * r * r;
    }
    public static void main(String[] args){
        int a=5, b=4;
        double r = 4.0, ar;
        System.out.println("a: " + a + "\nb: "+b);
        swap(a, b);
        System.out.println("a: " + a + "\nb: "+b);
        ar = area(r);
        System.out.println("Area: " + ar);
    }
}
