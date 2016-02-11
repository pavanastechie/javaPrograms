import java.util.Comparator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {
	
	public static void main(String[] args) {
		TreeMap<Integer,Integer> tm = new TreeMap<Integer, Integer>();
		tm.put(1, 2000);
		tm.put(2, 1500);
		tm.put(4, 2300);
		tm.put(6, 2600);
		tm.put(3, 4000);
		System.out.println("SortedMap Method firstKey "+tm.firstKey());
		System.out.println("SortedMap Method lastKey "+tm.lastKey());
		System.out.println("SortedMap Method headMap "+tm.headMap(3));
		System.out.println("SortedMap Method tailMap "+tm.tailMap(2));
		System.out.println("SortedMap Method subMap "+tm.subMap(2,4));
		//navigableMap methods
		System.out.println("NavigableMap Method ceilingKey "+tm.ceilingKey(5));
		System.out.println("NavigableMap Method ceilingEntry "+tm.ceilingEntry(5));
		System.out.println("NavigableMap Method floorKey "+tm.floorKey(5));
		System.out.println("NavigableMap Method floorEntry "+tm.floorEntry(5));
		System.out.println("NavigableMap Method lowerKey "+tm.lowerKey(6));
		System.out.println("NavigableMap Method lowerEntry "+tm.lowerEntry(6));
		System.out.println("NavigableMap Method higherKey "+tm.higherKey(4));
		System.out.println("NavigableMap Method higherEntry "+tm.higherEntry(4));
		NavigableSet<Integer> s = tm.descendingKeySet();
		System.out.println("NavigableMap Method descendingKeySet "+s);
		NavigableMap<Integer, Integer> nm = tm.descendingMap();
		System.out.println("NavigableMap Method descendingMap "+nm);
		System.out.println("NavigableMap Method pollFirstEntry "+tm.pollFirstEntry());
		System.out.println("NavigableMap Method pollFirstEntry "+tm.pollLastEntry());
		System.out.println(tm);
		TreeMap<Integer,Integer> tm2 = new TreeMap<Integer, Integer>(new mycomp());
		tm2.put(1, 2000);
		tm2.put(2, 1500);
		tm2.put(4, 2300);
		tm2.put(6, 2600);
		System.out.println(tm2);
		TreeMap<Integer,Integer> tm3 = new TreeMap<Integer, Integer>(tm2);
		SortedMap<Integer, Integer> sm = new TreeMap<Integer, Integer>();
		TreeMap<Integer,Integer> tm4 = new TreeMap<Integer, Integer>(sm);
	}

}

class mycomp implements Comparator<Object>{
@Override
	     public int compare(Object o1, Object o2) {
	Integer valueA = (Integer) o1;
	Integer valueB = (Integer) o2;
	         return valueB.compareTo(valueA);
	     }

}
