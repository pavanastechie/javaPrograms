
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {

	public static void main(String[] args){
		IdentityHashMap<String, Double> ihm = new IdentityHashMap<String, Double>();
		ihm.put("pavan", new Double(9.8));
		ihm.put("ravi", 9.1);
		ihm.put("ram", 8.6);
		ihm.put("suresh", 8.2);
		
		for (Map.Entry<String, Double> entry : ihm.entrySet()) {
			String key = entry.getKey().toString();
			String value = entry.getValue().toString();
			Double d = ihm.get("pavan")+1.0;
			if(entry.getKey() == "pavan"){
			entry.setValue(d);
			}
			System.out.println(key+ "---"+ value);
			}
		System.out.println(ihm);
		IdentityHashMap<String, Double> ihm1 = new IdentityHashMap<String, Double>(20);
		IdentityHashMap<String, Double> ihm2 = new IdentityHashMap<String, Double>(ihm);
	}
}
