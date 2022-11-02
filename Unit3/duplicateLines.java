package Unit3;

import java.io.*;

import java.util.ArrayList;

public class duplicateLines {

    public static void main(String[] args) throws IOException {
        FileReader read;
        BufferedReader in;
        FileWriter output;
        try{
            read = new FileReader("/home/kishan/Test/Unit3/fil.txt");
            in = new BufferedReader(read);
            output = new FileWriter("/home/kishan/Test/Unit3/fil3.txt");
            ArrayList<String> list= new ArrayList<>();
            String s;
            while(in.ready()){
                list.add(in.readLine());
            }
            in.close();
            int l = list.size();
            for (String value : list) {
                s = value;
                System.out.println(s);
                output.write(s);
            }
        }
        finally{
        }
    }
}
