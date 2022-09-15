package Unit2;

import java.util.Scanner;

public class stringRotation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1;
        s1 = sc.nextLine();
        String sr ="";
        int l = s.length();
        int k = 0;
        for(int i=0; i<l;i++){
            sr=sr + s.charAt(l-i-1);

            /*
            for(int j=i; j<l;j++){
                sr = sr + s.charAt(j);
            }
            for(int j=0;j<i;j++){
                sr = sr + s.charAt(j);
            }
            System.out.println(sr);

             */
        }
        if(sr.equals(s1)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
    }
}
