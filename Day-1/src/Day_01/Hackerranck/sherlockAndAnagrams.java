package Day_01.Hackerranck;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'sherlockAndAnagrams' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int sherlockAndAnagrams(String s) {
    // Write your code here
      int length= s.length();
      int count=0;
      
      for(int size =1;size<=length;size++){
         ArrayList<String> temp =new ArrayList<>();
        for(int idx =0;idx<=length-size;idx++){
            String sub=s.substring(idx,idx+size);
             char[] chars = sub.toCharArray();
             Arrays.sort(chars);

              String sorted = new String(chars);
            
            temp.add(sorted);
        }
          int si =temp.size();
          
          String arr[] =new String[si];
          
          int idx =0;
          
          while(idx<si){
            String _curr = temp.get(idx);
            arr[idx]=_curr;
            idx++;
          }
          
          for(int i =0;i<arr.length-1;i++){
             for(int j =i+1;j<arr.length;j++){
                String a =arr[i];
                String b=arr[j];
                
                if(a.equals(b)){
                    count++;
                }
                
             }
          }
          
        
        
    
      }
      
     
      return count;
    }

}

public class sherlockAndAnagrams {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        for (int qItr = 0; qItr < q; qItr++) {
            String s = bufferedReader.readLine();

            int result = Result.sherlockAndAnagrams(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}

