import java.util.Scanner;
class totalVowel
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int k=0, l;
        char c;
        int ar[] = new int[5];
        String resp, prompt;
        while(true)
        {
            System.out.println("Do you want to add a sentence?");
            resp = sc.nextLine();
            System.out.print("");
            if (resp.equals("y"))
            {
                int arSen[] = new int[5];
                k++;
                System.out.println("Enter a sentence");
                prompt = sc.nextLine();
                l = prompt.length();
                for(int i=0; i<l; i++)
                {
                    c = prompt.toLowerCase().charAt(i);
                    if (c=='a')
                    {
                        ar[0]++;
                        arSen[0]++;
                    }
                    else if(c=='e')
                    {
                        ar[1]++;
                        arSen[1]++;
                    }
                    else if(c=='i')
                    {
                        ar[2]++;
                        arSen[2]++;
                    }
                    else if(c=='o')
                    {
                        ar[3]++;
                        arSen[3]++;
                    }
                    else if(c=='u')
                    {
                        ar[4]++;
                        arSen[4]++;
                    }
                }
                System.out.println("Vowels in this sentence:");
                System.out.println("a: "+arSen[0]);
                System.out.println("e: "+arSen[1]);
                System.out.println("i: "+arSen[2]);
                System.out.println("o: "+arSen[3]);
                System.out.println("u: "+arSen[4]);
            }
            else
            {
                break;
            }
        }
        System.out.println("The number of sentences entered: " + k);
        System.out.println("Vowels in all the entered sentence:");
        System.out.println("a: "+ar[0]);
        System.out.println("e: "+ar[1]);
        System.out.println("i: "+ar[2]);
        System.out.println("o: "+ar[3]);
        System.out.println("u: "+ar[4]);
        sc.close();
    }
}