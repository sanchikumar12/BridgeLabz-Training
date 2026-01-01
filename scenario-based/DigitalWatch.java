import java.util.*;

public class  DigitalWatch{

public static void main(String [] agrs){
 
  Scanner sc =new Scanner(System.in);
  
   int hour =24;
   int min =60;

   for(int i=0;i<=hour;i++){
    for(int j=0;j<=min;j++){
       
          if(i==13 && j==0){      
              
              System.out.println("Power Cut ");
              break;
               

       }
 
          if(i==13){
                System.out.println("Power Cut ");
                break;
            }
 
   }
 
     
  
  



}











}