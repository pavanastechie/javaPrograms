import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String [] args) {
	TreeSet<Integer> ts = new TreeSet<Integer>();//default sorting order
	ts.add(101);
	ts.add(100);
	ts.add(109);
	ts.add(101);
	ts.add(107);
	ts.add(104);
	ts.add(103);
	// We can use Collection interface Methods
	// SortedSet Methods
	System.out.println("No Insertion Order "+ts);
	System.out.println("First --> "+ts.first());
	System.out.println("Last --> "+ts.last());
	System.out.println("HeadSet (lessthan element) --> "+ts.headSet(104));
	System.out.println("tailSet (>= element) --> "+ts.tailSet(104));
	System.out.println("subSet  --> "+ts.subSet(101, 107));	
	System.out.println("comparator  --> "+ts.comparator());	
	//navigable Methods
	System.out.println("Floor --> "+ts.floor(105));
	System.out.println("Ceiling --> "+ts.ceiling(105));
	System.out.println("Lower --> "+ts.lower(103));// strictly less than
	System.out.println("Higher --> "+ts.higher(103));// strictly greater than 
	
    System.out.println("HeadSet in navigableSet --> "+ts.headSet(104, true)); //true if the high endpoint is to be included in the returned view
	System.out.println("tailSet in navigableSet --> "+ts.tailSet(104, false));// true if the low endpoint is to be included in the returned view
	System.out.println("subSet in navigableSet --> "+ts.subSet(101, false, 107, false));	// high endpoint (exclusive) of the keys in the returned map
	
	Iterator<Integer> iterator = ts.descendingIterator(); // descending Iterator
	System.out.println("descending Iterator");
    while (iterator.hasNext()){
  	   System.out.println(iterator.next() + " ");
  	   }
    
    ts=(TreeSet<Integer>)ts.descendingSet();
    Iterator<Integer> iterator1 = ts.iterator();
    System.out.println("descendingSet -->");
    while (iterator1.hasNext()){
  	   System.out.println(iterator1.next() + " ");
  	   }
    System.out.println("pollFirst "+ts.pollFirst()); // removes first
    System.out.println("pollLast "+ts.pollLast()); // removes last
    System.out.println(ts);

	}

}
