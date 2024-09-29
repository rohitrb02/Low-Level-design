package bdp;
import java.util.ArrayList;
import java.util.List;

public class EngineeringStudentBuilder extends StudentBuilder{
	
	public StudentBuilder setSubjects() {
		List<String> subs = new ArrayList<>();
		subs.add("DSA");
		subs.add("OS");
		subs.add("AI-ML");
		this.subjects = subs;
		return this;
	}
}
