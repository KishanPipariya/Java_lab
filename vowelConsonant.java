import java.util.Scanner;

class vowelConsonant
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int l = s.length();
        int v=0, c=0;
        s=s.toLowerCase();
        for(int i=0; i<l; i++)
        {
            char ch;
            ch = s.charAt(i);
            if(ch=='a'|| ch=='e'|| ch=='i' || ch=='o'|| ch=='u')
            {
                v++;
            }
            else if(ch>=97 && ch<=122)
            {
                c++;
            }
        }
        System.out.println("Vowels: " + v);
        System.out.println("Consonants: " + c);
    }
}
