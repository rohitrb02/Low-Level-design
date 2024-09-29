package bdp;
import java.util.*;
public class Student {

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", age=" + age + ", name=" + name + ", motherName=" + motherName
				+ ", fatherName=" + fatherName + ", subjects=" + subjects + "]";
	}

	int rollNumber;
	int age;
	String name;
	String motherName;
	String fatherName;
	List<String> subjects;
	
	public Student(StudentBuilder builder) {
		this.rollNumber = builder.rollNumber;
		this.age = builder.age;
		this.name = builder.name;
		this.motherName = builder.motherName;
		this.fatherName = builder.fatherName;
		this.subjects = builder.subjects;

	}
	
}
