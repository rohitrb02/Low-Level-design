// It is used when we have to make copy/clone from Existing object

package pdp;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(20,465,"Rohit");
		
		//Creating clone of the object
		
		Student cloneStudent = (Student) student.clone();
		System.out.println("Original Student: " + student.name);
		System.out.println("Cloned Student: " + cloneStudent.name);
	}

}
