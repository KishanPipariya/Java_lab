package Unit3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class readWrite {
    public static void main(String[] args) throws IOException {
        int c;
        char ch;
        FileInputStream input = null;
        FileOutputStream output = null;
        try{
            input = new FileInputStream("/home/kishan/Test/Unit3/fil.txt");
            output = new FileOutputStream("/home/kishan/Test/Unit3/fil1.txt");
            while((c=input.read() ) != -1) {
                String s;
                ch = Character.toUpperCase((char)(c));
                output.write((int)(ch));
            }

        }
        finally{

        }
    }
}
