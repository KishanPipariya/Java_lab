import java.util.Scanner;
class capitalWords
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char c;
        int k=0, ks=0, l;
        s = s.trim();
        s = " " + s;
        l = s.length();
        for(int i=0; i<l; i++)
        {
            c = s.charAt(i);
            if(c == ' ')
            {
                ks++;
            }
            if(c>=65&&c<=90&&s.charAt(i-1)==' ')
            {
                k++;
                ks++;
            }
        }
        System.out.println(k);
        sc.close();
    }
}
        
                

