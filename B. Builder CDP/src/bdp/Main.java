//When you want to create object step by step
package bdp;
public class Main {
	public static void main(String args []) {
		Director dicrector1 = new Director(new EngineeringStudentBuilder());
		Director dicrector2 = new Director(new MBAStudentBuilder());
		
		Student EnggStudent = dicrector1.createStudent();
		Student MBAStudent = dicrector2.createStudent();
		
		System.out.println(EnggStudent.toString());
		System.out.println(MBAStudent.toString());

	}
}
