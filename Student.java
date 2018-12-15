package college_static;

public class Student {
	
	String name;
	int roll_no;
	static int count=1;
	
	public Student(String name) {
		this.name = name;
		this.roll_no=count;
		count++;
		}
	

	public static void main(String[] args) {

		System.out.println("Program started");
		Student s1=new Student("A");
		Student s2=new Student("B");
		Student s3=new Student("C");
		Student s4=new Student("D");
		Student s5=new Student("E");
		Student s6=new Student("F");
		Student s7=new Student("G");
		Student s8=new Student("H");
		Student s9=new Student("I");
		Student s10=new Student("J");
		
		s1.display();
		s2.display();
		s3.display();
		s4.display();
		s5.display();
		s6.display();
		s7.display();
		s8.display();
		s9.display();
		s10.display();
		Display_Total();
		System.out.println("Program Ended");
				
	}


	/*
	 * this function displays total number of students
	 * 
	 */
	public static void Display_Total() {
		
		System.out.println(count);
	}
	
/*
 * Expected 
 * 1) List of students 
 * 2) With Name 
 * 3) With Roll Number
 * 
 */
	public  void display() {
	System.out.println("name is"+name);
	System.out.println("rollno is"+roll_no);
		
		
	}


}
