package Day_01.Day_01_Hackerrank;

import java.io.*;
import java.util.*;

public class JavaToken {

    public static void main(String[] args)throws IOException {
        BufferedReader reader  =new BufferedReader(new InputStreamReader(System.in));
        String in =reader.readLine().trim();
        // Write your code here.
        String[] ss =in.split("[!,?._'@\\s]+");
        int len =ss.length;
        System.out.println(len); 
        for(String a:ss){
        System.out.println(a);
        }
        
        
        
        
        
        reader.close();
    }
}

