import java.util.*;

public class Mean {

    public static void main(String[] args) {

      

        Scanner sc = new Scanner(System.in);
        double heights[] =new double[11];
       
         for(int a=0;a<11;a++){
         
            heights[a]=sc.nextDouble();
         }
         

          double sum=0.0;
         for(double h : heights){
            sum+=h;
         }
     
        // Printing output
    	double mean= sum/11;
         System.out.println("Mean Height is :"+mean);
       
       

        
    }
}
