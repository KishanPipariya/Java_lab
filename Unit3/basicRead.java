package Unit3;

import java.io.FileReader;
import java.io.IOException;

public class basicRead {
    public static void main(String[] args) throws IOException {
        FileReader input = null;
        int c=0,k=0, ks=0, ksp=0;
        try {
            input = new FileReader("/home/kishan/Test/Unit3/fil.txt");
            char ch, pr='\b';
            while((c=input.read() ) != -1){
                ch = (char)(c);
                k++;
                if((ch ==' '|| ch =='\n') && (pr != ' ' && pr != '\n')){
                    ksp++;
                }
                if(ch == '.'){
                    ks++;
                    ksp++;
                }
                pr = ch;
            }

        }
        finally{
            System.out.println(k);
            System.out.println(ksp);
            if(input != null){
                input.close();
            }
        }
    }
}
