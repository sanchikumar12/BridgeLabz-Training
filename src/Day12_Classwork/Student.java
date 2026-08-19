package Day12_Classwork;

public class Student {
	public String name;
	public int rollno;

	public Student(String  name,int rollno) {
		this.name=name;
		this.rollno=rollno;
	}
	
	public void displayinfo() {
		System.out.println("Name is "+this.name);
		System.out.println("Roll No is"+this.rollno);
	}
	
	public static void main(String[] agrs) {
		Student s =new Student("Sanchit",234);
		s.displayinfo();
	}

}
