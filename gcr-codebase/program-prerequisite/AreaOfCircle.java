import java.util.Scanner;

public class AreaOfCircle{

    public static final double PI = 3.14159;

    public static void main(String [] args){
	Scanner sc = new Scanner(System.in);

        System.out.println("Enter the radius of the circle");
	double radius = sc.nextDouble();

	double area = PI*radius*radius;
	
	System.out.println("The area of circle is " + area);

	sc.close();
   }
}