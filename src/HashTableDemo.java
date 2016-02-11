import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo {
	
	public static void main(String[] args){
		
		Hashtable<String,Integer> ht = new Hashtable<String, Integer>();//11
		ht.put("sachin", 78);
		ht.put("sachin", 78);// this not added 
		ht.put("Kohli", 40);
		ht.put("dhoni", 42);
		ht.put("dhoni", 42);
		for (Map.Entry<String, Integer> entry : ht.entrySet()) {
			String key = entry.getKey().toString();
			String value = entry.getValue().toString();
			Integer d = ht.get("sachin")+1;
			if(entry.getKey() == "pavan"){
			entry.setValue(d);
			}
			System.out.println(key+ "---"+ value);
			}
		Hashtable<String,Integer> ht1 = new Hashtable<String, Integer>(20);
		Hashtable<String,Integer> ht2 = new Hashtable<String, Integer>(20,1);
		Hashtable<String,Integer> ht3 = new Hashtable<String, Integer>(ht);


	}

}
