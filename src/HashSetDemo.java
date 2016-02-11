import java.util.HashSet;

public class HashSetDemo {
	public static void main(String args[]) {
		// create a hash set
		HashSet<String> hs = new HashSet<String>(); // 16 default
		// add elements to the hash set
		hs.add("B");
		hs.add("A");
		hs.add("D");
		hs.add("E");
		hs.add("C");
		hs.add("F");
		System.out.println(hs);
		HashSet<String> hs1 = new HashSet<String>(20);
		System.out.println(hs1.size());
		HashSet<String> hs2 = new HashSet<String>(20, 1);
		System.out.println(hs2.size());
		HashSet<String> hs3 = new HashSet<String>(hs);
		System.out.println("After adding collection " + hs3);

	}
}
