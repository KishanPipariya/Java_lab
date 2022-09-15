import java.util.Scanner;
//matrix multiplication
//implement sort

class stringDiamond
{
    public static void main(String args[])
    {
        String s;
        int l;
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();
        l = s.length();
        for(int i=0; i<l; i++)
        {
            for(int j=l-1-i;j>0;j--)
            {
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++)
            {
                System.out.print(s.charAt(k) + " ");
            }
            System.out.println();
        }
        for(int i=0; i<l; i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=0; k<l-1-i; k++)
            {
                System.out.print(s.charAt(k) + " ");
            }
            System.out.println();
        }
    }
}

