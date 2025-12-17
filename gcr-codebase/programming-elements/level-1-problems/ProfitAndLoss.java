import java.util.*;
public class  ProfitAndLoss{

public static void main(String[] agrs){
  

        double costPrice = 129.0;
        double sellingPrice = 191.0;

        double profit = sellingPrice - costPrice;
        double percentage = (profit / costPrice) * 100;

        System.out.println(
            "The Cost Price is INR " + costPrice +
            " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit +
            " and the Profit Percentage is " + percentage + "%"
        );
  

}

}