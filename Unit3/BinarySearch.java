package Unit3;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int start, end, mid;
        String[] sa = s.split(" ");
        int l = sa.length;
        int[] ar = new int[l];
        for(int i=0; i<l; i++){
            ar[i] = Integer.parseInt(sa[i]);
        }
        int n = sc.nextInt();
        start=0;
        end=l-1;
        while(start<=end){
            mid = (start+end)/2;
            if(ar[mid]>n){
                start = mid + 1;
            }
            else if(ar[mid]<n){
                end = mid - 1;
            }
            else{
                System.out.println("Found at: " + mid);
                break;
            }
        }
    }
}
