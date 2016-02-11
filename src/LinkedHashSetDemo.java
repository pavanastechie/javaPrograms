import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String args[]) {
		// create a hash set
		LinkedHashSet<String> lhs = new LinkedHashSet<String>(); // 16 default
		// add elements to the hash set
		lhs.add("B");
		lhs.add("A");
		lhs.add("D");
		lhs.add("E");
		lhs.add("C");
		lhs.add("F");
		System.out.println(lhs);
		LinkedHashSet<String> lhs1 = new LinkedHashSet<String>(20);
		System.out.println(lhs1.size());
		LinkedHashSet<String> lhs2 = new LinkedHashSet<String>(20, 1);
		System.out.println(lhs2.size());
		LinkedHashSet<String> lhs3 = new LinkedHashSet<String>(lhs);
		System.out.println("After adding collection " + lhs3);

	}
}

