package bdp;

public class Director {

	StudentBuilder studentBuilder;
	
	Director(StudentBuilder studentBuilder){
		this.studentBuilder = studentBuilder;
	}
	
	public Student createStudent() {
		if(studentBuilder instanceof EngineeringStudentBuilder)
			return studentBuilder.setRollNumber(465).setAge(25).setName("Rohit").setSubjects().build();
		else if(studentBuilder instanceof MBAStudentBuilder)
			return studentBuilder.setRollNumber(465).setAge(25).setName("Rohit").setFatherName("F").setMotherName("M").build();
		else
			return null;
	}
}
