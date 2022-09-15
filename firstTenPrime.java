import java.lang.Math;
public class firstTenPrime
{
    public static void main(String args[])
    {
        System.out.println("The prime numbers are:");
        int k=0, n=2, m;
        m = Integer.parseInt(args[0]);
        while(k<m)
        {
            int count=0;
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i ==0)
                {
                    count++;
                }
                if(count>0)
                {
                    break;
                }
            }
            if(count==0)
            {
                System.out.println(n);
                k++;
            }
            n++;
        }
    }
}

                
            
