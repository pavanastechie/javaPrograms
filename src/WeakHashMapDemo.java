
import java.util.WeakHashMap;
import java.util.Map;

public class WeakHashMapDemo {

	public static void main(String[] args){
		WeakHashMap<String, Double> whm = new WeakHashMap<String, Double>();
		whm.put("pavan", new Double(9.8));
		whm.put("ravi", 9.1);
		whm.put("ram", 8.6);
		whm.put("suresh", 8.2);
		
		for (Map.Entry<String, Double> entry : whm.entrySet()) {
			String key = entry.getKey().toString();
			String value = entry.getValue().toString();
			Double d = whm.get("pavan")+1.0;
			if(entry.getKey() == "pavan"){
			entry.setValue(d);
			}
			System.out.println(key+ "---"+ value);
			}
		System.out.println(whm);
		WeakHashMap<String, Double> whm1 = new WeakHashMap<String, Double>(20);
		WeakHashMap<String, Double> whm2 = new WeakHashMap<String, Double>(20, 1);
		WeakHashMap<String, Double> whm3 = new WeakHashMap<String, Double>(whm);
	}
}

