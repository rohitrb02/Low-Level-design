package bdp;
import java.util.*;
public class MBAStudentBuilder extends StudentBuilder{
	
	public StudentBuilder setSubjects() {
		List<String> subs = new ArrayList<>();
		subs.add("Economics");
		subs.add("Business Studies");
		subs.add("Management");
		this.subjects = subs;
		return this;
	}
}
