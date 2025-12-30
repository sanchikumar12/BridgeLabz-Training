import java.util.*;
public class TrainReservation{

public static void main(String[] agrs){
Scanner sc =new Scanner(System.in);

     System.out.println("Enter The Train capacity :");
     int n =sc.nextInt();

     int seats=n;
     String price ="500";
    
     boolean isfull =false;

     while(isfull==false){
     
            
       System.out.println("Enter 1 for Booking Ticket :");
       System.out.println("Enter 2 for Checking Available Tickets :");
	System.out.println("Enter 3 for Price of Ticket :");

          int option =sc.nextInt();
       

       switch(option){
             case 1 : 
                  if(seats>0){
                      seats=seats-1;
                     System.out.println("Ticket Booked Succesfully :");
                   }else{
                     isfull=true;
                     System.out.println("No Ticket Left :");
                     }
                     break;
                 case 2 :
                        System.out.println("Available Tickets are:"+seats);
                        break;
                  case 3 :
                         System.out.println("Price of Ticket is:"+price);
                        break;
                
                  default:
                          System.out.println("Invalid Input");
                        break;



          }

       
         

      }
 





}



}