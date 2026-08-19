package Day_07_Classwork;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class SumofDigit {
    public static void main(String[] args) {
          int n =123;
          int sum=0;
          while(n!=0){
              int last=n%10;
              sum+=last;
              n=n/10;
          }
          
          System.out.println(sumdigit(123));
    }
    
    public static int sumdigit(int n){
        if(n==0){
            return 0;
        }
        int digit =n%10;
        int nn=n/10;
        return digit +sumdigit(nn);
    }
    
}