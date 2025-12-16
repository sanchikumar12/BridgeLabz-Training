import java.util.Scanner;

public class VolumeOfCylinder{
    
    public static final double PI = 3.14159;

    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the radius of the cylinder");
	double radius = sc.nextDouble();
	System.out.println("Enter the height of the cylinder");
	double height = sc.nextDouble();

	double volume = PI * radius * radius * height;

	System.out.print("The volume of the cylinder is " + volume);
	
	sc.close();
    }
}