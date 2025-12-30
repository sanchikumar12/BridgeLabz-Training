import java.util.*;

public class MovieTicket{

public static void main(Strings [] agrs){

 public Boolean iscustomer = true;


  while(iscustomer){
  
       Scanner sc =new Scanner(System.in);
       System.out.println("Enter Movie name :");
       String movie=  sc.next();

       String movietype ="";
  
       System.out.println("Enter 1 for Comedy");
       System.out.println("Enter 2 for Action");
       System.out.println("Enter 3 for Horror");
     
       int choice=sc.nextint();
       int price  =0;

       switch(choice){
             case 1: 
                movie="Comedy";
                System.out.println("Selected Movie is Comedy");
               
                break;

                case 2:
                  movie="Action";
                 System.out.println("Selected Movie is Action");
   
                 break;
                  
                 case 3: 
                      movie="Horror";
                    System.out.println("Selected Movie is Horror");
                  
                     break;

                 default:
                       System.out.println("Invalid Option Clicked");
                       break;
          }
 
 
              int price =0;
           
       System.out.println("Select Seat :");
       System.out.println("Enter 1 for Gold");
       System.out.println("Enter 2 for Silver");
     
       int choice=sc.nextint();
       int price  =0;

       switch(choice){
             case 1: 
          
                 price=300;
                
               
                break;

                case 2:
                   price =500;   
                 break;

                 default:
                       System.out.println("Invalid Option Clicked");
                       break;
          }
  
 
       System.out.println("Select Snacks :");
       System.out.println("Enter 1 for Burger");
       System.out.println("Enter 2 for pizza");
     
       int choice=sc.nextint();
       int price  =0;

       switch(choice){
             case 1: 
          
                 price+=300;
                
               
                break;

                case 2:
                   price +=500;   
                 break;

                 default:
                       System.out.println("Invalid Option Clicked");
                       break;
          }


        System.out.println("...............Billing Summery ..............");
          
         System.out.println("Movie name is :" +moviename);
         System.out.println("Movie type is :" +movietype);
         System.out.println("Total price is :" +price);
 
 System.out.println(...........................................);

        
 

          
         
          


    
         


   }






}










}