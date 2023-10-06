package day22Collections_Queue_Map;
import java.util.*;

public class exampleMap {
	
	public static void main(String[] args) {
		//Map<String,Integer> student = new HashMap<>();//random outout
		//Map<String,Integer> student = new LinkedHashMap<>();//inserted order output
		Map<String,Integer> student = new TreeMap<>();
		
		student.put("rashmi", 85);
		student.put("rupesh", 95);
		student.put("siya", 65);
		student.put("riya", 81);
		student.put("bena", 95);
		student.put("pinky", 77);
		//student.put(null, 96); //but not in treemap
		System.out.println(student);
		
		
	}

}
