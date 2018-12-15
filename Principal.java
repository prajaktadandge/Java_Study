package college_static;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1 = new Student("A");
		Student s2 = new Student("B");
		s1.display();
		s2.display();
		
		Student.Display_Total();
		System.out.println(Student.count);
		

	}

}
