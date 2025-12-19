import java.util.*;

public class OddEven {

    public static void main(String[] args) {

      

        Scanner sc = new Scanner(System.in);
        int number  =sc.nextInt();
          
         int []  odd  =new int[number/2+1];
           int []  even  =new int[number/2+1];
         


         int idx1=0;
          int idx2=0;

	for(int i=1;i<=number;i++){
                if(i%2==0){
                 odd[idx1]=i;
                   idx1++;
                 }else{
                  even[idx2]=i;
                      idx2++;
                    }
            }

 

       for(int o: odd){
         System.out.println("odd is:"+o);
         }


        for(int e: even){
         System.out.println("even is:"+e);
         }
       
        


       
       

        
    }
}
