package Day_01.Hackerranck;

import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        
        int [] freq =new int[26];
        a =a.toLowerCase();
        b=b.toLowerCase();
        
        for(char _cur:a.toCharArray()){
             
             int _idx=_cur-'a';
             freq[_idx]++;            
        }
        
        for(char _cur:b.toCharArray()){
             
             int _idx=_cur-'a';
             freq[_idx]--;            
        }
         boolean ans =true;
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                ans=false;
            }
        }
        
        return ans;
        
        
    }

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}