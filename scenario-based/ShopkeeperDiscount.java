import java.util.*;

public ShopkeeperDiscount {

public static void main(String[] agrs){
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter The number :"); 
  int n=sc.nextInt();
  int [] iteam=new int [n];

  for(int i =0;i<n;i++){
       iteam[i]=sc.nextInt();
    }
  
  System.out.println("Enter Discount :");
  //use if-else for discount==>
  int discount=sc.nextInt();

   int totalprice=0;
  for(int a:iteam){
   totalprice+=a;
   }

   int discountprice =totalprice*(discount/100);
   System.out.println("the total price is "+totalprice+ "and discount price is :"+discountprice);
  

}

}