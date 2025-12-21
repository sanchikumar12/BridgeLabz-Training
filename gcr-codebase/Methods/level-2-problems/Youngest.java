import java.util.*;
public class Yougest{

public static void main(String [] agrs){
 Scanner sc =new Scanner(System.in);
  int age [] =new int[3];
  int height [] =new int[3];
  for(int i=0;i<3;i++){
     System.out.println("Enter Age "+(i+1));
     int a=sc.nextInt();
     age[i]=a;
  
      System.out.println("Enter your height :"+(i+1));
       int b =sc.nextInt();
       height[i]=b; 
   }


     int maxage=Integer.MIN_VALUE;
     int ageidx=0;

     for(int i=0;i<age.length;i++){
        if(maxage<age[i]){
           maxage=
          ageidx=i;
         }
         
     }

     int maxheight=Integer.MIN_VALUE;
     int heightidx=0;

     for(int j=0;j<height.length;j++){
          if(maxheight<height[j]){
            heightidx=j;
         }
         
     }


 System.out.println("\n--- RESULTS ---");
        System.out.println("Oldest Person: Person " + (ageidx + 1) + " with age " + maxage);
        System.out.println("Tallest Person: Person " + (heightidx + 1) + " with height"+maxheight);

 
      
    


     

     

}

}