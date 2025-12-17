import java.util.*;
public class   VolumeOfEarth{

public static void main(String[] agrs){
  

      
        double radius = 6378.0;

      
        double pi = Math.PI;


        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radius, 3);


        double kmToMiles = 0.621371;

        double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);

   
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3);
       


}

}