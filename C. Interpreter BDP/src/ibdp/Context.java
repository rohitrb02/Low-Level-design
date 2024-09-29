package ibdp;
import java.util.*;
public class Context {
	Map<String,Integer> contextMap =  new HashMap();
	
	public void put(String strVariable, int intVal) {
		contextMap.put(strVariable, intVal);
	}
	
	public int getValue(String strVariable) {
		return contextMap.get(strVariable);
	}
}
