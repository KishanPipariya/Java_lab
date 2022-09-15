import java.util.Scanner;

class sorting
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int ar[] = new int[5];
        int t;
        System.out.println("Enter 5 elements:");
        for(int i=0; i<5; i++)
        {
            ar[i] = sc.nextInt();
        }
        for(int i=0; i<5; i++)
        {
            for(int j=0; j<5-i-1;j++)
            {
                if (ar[j]>ar[j+1])
                {
                    t = ar[j];
                    ar[j] = ar[j+1];
                    ar[j+1] = t;
                }
            }
        }
        System.out.println("The sorted array is:");
        for(int i=0; i<5; i++)
        {
            System.out.print(ar[i] + " ");
        }
        System.out.println("\nEnter the number of elements:");
        int n;
        n = sc .nextInt();
        int ar1[] = new int[n];
        System.out.println("Enter the elements:");
        for(int i=0; i<n; i++)
        {
            ar1[i] = sc.nextInt();
        }
        ar1 = sort(ar1);
        System.out.println("The sorted array is:");
        for(int i=0; i<n; i++)
        {
            System.out.print(ar1[i]+ " ");
        }
        System.out.println();
    }
    public static int[] sort(int arr[])
    {
        int l, t;
        l = arr.length;
        for(int i=0; i<l; i++)
        {
            for(int j=0; j<l-i-1;j++)
            {
                
                if (arr[j]>arr[j+1])
                {
                    t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] =t;
                }
            }
        }
        return arr;
    }
}
