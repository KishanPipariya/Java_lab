import java.lang.Math;

public class primeQ {
    static void prime(double d){
        double n = Math.sqrt(d);
        int no = (int)(d);
        int k=0;
        for(int i=2; i<n; i++){
            if(no%i==0){
                k++;
                break;
            }
        }
        if(k==0) {
            System.out.println("Prime");
        }
        else{
            System.out.println("Not Prime");
        }
    }

    static void prime(int n){
        int[] ar = new int[n+1];
        for(int i=2;i<=n;i++){
            for(int j=i*i;j<=n;j++){
                if(j%i==0){
                    ar[j]=1;
                }
            }
            while(i<=n&&ar[i]==1){
                i++;
            }
        }
        for(int i=2; i<n+1;i++){
            if(ar[i]==0){
                System.out.print(i+" ");
            }

        }
        System.out.println();
    }

    public static void main(String[] args){
        prime(100);
        prime(8.0);
    }
}
