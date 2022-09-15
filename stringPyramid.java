import java.util.Scanner;

class stringPyramid
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int l;
        String s;
        char c;
        s = sc.nextLine();
        l = s.length();
        for(int i=0; i<l; i++)
        {
            for(int j=l-1-i;j>0; j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
               c = s.charAt(k);
               System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}

