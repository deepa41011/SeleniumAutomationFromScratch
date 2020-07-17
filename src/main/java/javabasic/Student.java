package javabasic;

public class Student {
	 int student_id;
	 String name;
	
	
	public void method1() {
		System.out.println("Welcome to all testers");
	}
	
	public void method2() {
		System.out.println("This course is to learn selenium automation");
	}

	public static void main(String[] args) {
		
		Student student= new Student();	
		student.student_id = 15;
		student.name = "Deepa";
		
		System.out.println("Student id is : " +  student.student_id);
		System.out.println("Student name is : " +  student.name);
		student.method1();
		student.method2();
		
		

	}

}
