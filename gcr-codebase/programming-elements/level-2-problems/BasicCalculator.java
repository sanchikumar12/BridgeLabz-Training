import java.util.Scanner;

public class AreaofTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter base number: ");
        double base = scanner.nextDouble();

        System.out.print("Enter height number: ");
        double height = scanner.nextDouble();
        
        double area= 0.5*height*base;


        



        double baseIn = base / 2.54;
        double heightIn = height / 2.54;

       
        double areaIn = 0.5 * baseIn * heightIn;

     
        System.out.println("The Area of the triangle in sq in is " + areaIn +
                           " and sq cm is " + area);

        sc.close();
    }
}

