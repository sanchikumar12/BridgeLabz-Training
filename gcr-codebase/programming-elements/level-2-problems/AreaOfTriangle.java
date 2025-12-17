import java.util.Scanner;

public class PerimeterOfSquare{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter side : ");
        double side = scanner.nextDouble();

       
        double perimeter = 4*side;

     
        System.out.println("The length of the side is"+ side +" whose perimeter is"+ perimeter+
");

   
    }
}

