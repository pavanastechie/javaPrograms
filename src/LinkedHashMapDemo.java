import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args){
		LinkedHashMap<String, Double> hm = new LinkedHashMap<String, Double>();
		hm.put("pavan", new Double(9.8));
		hm.put("ravi", 9.1);
		hm.put("ram", 8.6);
		hm.put("suresh", 8.2);
		System.out.println("Size of LinkedHashMap "+hm.size());
		System.out.println("Is map is empty "+hm.isEmpty());
		System.out.println("getting suresh marks "+hm.get("suresh"));
		System.out.println("Key contains in map ? "+hm.containsKey("pavan"));
		System.out.println("value contains in map ? "+hm.containsValue(9.8));
		System.out.println("keyset "+hm.keySet());
		System.out.println("values in map "+hm.values());
		for (Map.Entry<String, Double> entry : hm.entrySet()) {
			String key = entry.getKey().toString();
			String value = entry.getValue().toString();
			Double d = hm.get("pavan")+1.0;
			if(entry.getKey() == "pavan"){
				System.out.println("in.......");
			entry.setValue(d);
			}
			System.out.println(key+ "---"+ value);
			}
		System.out.println(hm);
		hm.remove("ram");
		System.out.println(hm);
		hm.clear();
		System.out.println(hm);
		LinkedHashMap hm1 = new LinkedHashMap(20);
		LinkedHashMap hm2 = new LinkedHashMap(20, 1);
		
		LinkedHashMap<String, Double> hm3 = new LinkedHashMap<String, Double>(hm);
		System.out.println(hm3);
		hm3.clear();
		System.out.println(hm3);
		LinkedHashMap<String, Double> lm = new LinkedHashMap<String, Double>(20,1, false);
		lm.put("data2", 1.5);
		lm.put("data", 3.0);
		lm.put("data1", 2.5);
		System.out.println(lm);
		
		
		
	}
}