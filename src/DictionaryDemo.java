import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryDemo {

	public static void main(String[] args) {
		Dictionary<String,String> d = new Hashtable<String,String>();
		d.put("Data", "1");
		System.out.println(d.get("Data"));
	}
}
