import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Vector;
import java.util.WeakHashMap;

public class CollectionsDemo {

	public static void main(String [] args) {
		 Deque<Integer> deque = new ArrayDeque<Integer>(7);
	      
		   // populate the object
		   deque.add(1);
		   deque.add(2);
		   deque.add(3);
		   deque.add(4);
		   deque.add(5);        
		   deque.add(6);
		   deque.add(7);
		      
		   // get queue from the deque
		   Queue<Integer> nq = Collections.asLifoQueue(deque);      
		      
		   System.out.println("View of the queue is: "+nq);
		   ArrayList<Integer> ar = new ArrayList<Integer>(7);
		      
		   // populate the object
		   ar.add(1);
		   ar.add(7);
		   ar.add(2);
		   ar.add(4);
		   ar.add(3);		   
		   ar.add(5);        
		   ar.add(6);
		   
		   System.out.println("Binary Search element "+Collections.binarySearch(ar, 5));
		   System.out.println("Binary Search element by compartor "+Collections.binarySearch(ar, 4, new myComparator()));
		  
		   ArrayList<String> arlst = new ArrayList<String>();		     
		   // populate the list
		   arlst.add("TP");
		   arlst.add("PROVIDES");
		   arlst.add("QUALITY");
		   arlst.add("TUTORIALS");
		   
		   ArrayList<String> arlst1 = new ArrayList<String>();		     
		   // populate the list
		   arlst1.add("Data");
		   arlst1.add("Provid");
		  
		   
		   Collection<Integer> tslst;
		   Collection<String> tsStr;
		   tslst = Collections.checkedCollection(ar,Integer.class);
		   System.out.println("checkedCollection for String "+tslst);   
		   tsStr = Collections.checkedList(arlst, String.class);
		   System.out.println("checkedList for String "+tsStr);  
		   
		   Collections.copy(arlst, arlst1); 
		   System.out.println("Copied Data "+arlst1);  
		   
		   List<String> srclst = new ArrayList<String>(5);
		   List<String> destlst = new ArrayList<String>(10);
		      
		   // populate two lists
		   srclst.add("Java");
		   srclst.add("is");
		   srclst.add("best");
		      
		   destlst.add("C++");
		   destlst.add("is not");
		   destlst.add("older");      
		      
		   // check elements in both collections
		   boolean iscommon = Collections.disjoint(srclst, destlst);
		      
		   System.out.println("both are disjoint: "+iscommon);  
		   
		   List emptylst = Collections.emptyList();
		      
		   System.out.println("Created empty immutable list: "+emptylst);
		       
		   // try to add elements
		//   emptylst.add("A"); // throwns error
		 
		   List arrlist = new ArrayList();
		      
		   // populate the list
		   arrlist.add("A");
		   arrlist.add("B");
		   arrlist.add("C");
		      
		   System.out.println("List elements before fill: "+arrlist);
		      
		   // fill the list with 'TP'
		   Collections.fill(arrlist,"TP");
		      
		   System.out.println("List elements after fill: "+arrlist);    
		   
		   List arrlist1 = new ArrayList();
		      
		   // populate the list
		   arrlist1.add("A");
		   arrlist1.add("B");
		   arrlist1.add("C");
		   arrlist1.add("C");
		   arrlist1.add("C");      
		           
		   // check frequensy of 'C'
		   int freq = Collections.frequency(arrlist1, "C");
		      
		   System.out.println("Frequency of 'C' is: "+freq);    
		   
		   //get the starting position of the first occurrence of the specified target list within the specified source list.
		// create two array list objects       
		   List arrlistsrc = new ArrayList();
		   List arrlisttarget = new ArrayList();
		      
		   // populate two lists
		   arrlistsrc.add("A");
		   arrlistsrc.add("B");
		   arrlistsrc.add("C");
		   arrlistsrc.add("D");
		   arrlistsrc.add("E"); 
		      
		   arrlisttarget.add("C");
		   arrlisttarget.add("D");
		   arrlisttarget.add("E");
		           
		   // check target list in source list
		   int index = Collections.indexOfSubList(arrlistsrc, arrlisttarget);
		      
		   System.out.println("Target list starts at index: "+index);    
		   List arrlistsrc1 = new ArrayList();
		   List arrlisttarget1 = new ArrayList();
		      
		   // populate two lists
		   arrlistsrc1.add("A");
		   arrlistsrc1.add("B");
		   arrlistsrc1.add("C");
		   arrlistsrc1.add("D");
		   arrlistsrc1.add("E"); 
		      
		   arrlisttarget1.add("C");
		   arrlisttarget1.add("D");
		   arrlisttarget1.add("E");
		           
		   // check starting position of the last occurrenc
		   int index2 = Collections.lastIndexOfSubList(arrlistsrc1, arrlisttarget1);
		      
		   System.out.println("Starting position is: "+index2); 
		   
		   List arrlist2 = new ArrayList();
		   Vector v = new Vector();
		      
		   // populate the vector
		   v.add("A");       
		   v.add("B");
		   v.add("C");
		   v.add("D");
		   v.add("E");
		      
		   // create enumeration
		   Enumeration e = v.elements();
		      
		   // get the list
		   arrlist2 = Collections.list(e);
		      
		   System.out.println("Value of returned list: "+arrlist2);
		   
		// create link list object 
		   LinkedList list2 = new LinkedList();
			  
		   // populate the list  
		   list2.add(-18);  
		   list2.add(40);  
		   list2.add(-45);  
		   list2.add(12); 
			  
		   System.out.println("Max value is: " + Collections.max(list2));  
		   System.out.println("Max value is: " + Collections.max(list2, new myComparator()));
		   System.out.println("Max value is: " + Collections.min(list2)); 
		   System.out.println("Max value is: " + Collections.min(list2, new myComparator()));
		   List list3 = Collections.nCopies(5, "tuitorial Point");
		      
		   // create an iterator
		   Iterator itr = list3.iterator();
		      
		   System.out.println("Values are :");
		   while (itr.hasNext()){
		   System.out.println(itr.next());
		   
		   
		   }
		   
		   Map<String, Boolean> map = new WeakHashMap<String, Boolean>();

		   // create a set from map
		   Set<String> set = Collections.newSetFromMap(map); 
		      
		   // add values in set
		   set.add("Java"); 
		   set.add("C");
		   set.add("C++");
		      
		   // set and map values are
		   System.out.println("Set is: " + set);
		   System.out.println("Map is: " + map);
		   
		// create vector
		   Vector vector = new Vector();
		      
		   // populate the vector
		   vector.add("R");
		   vector.add("B");
		   vector.add("R");
			   
		   System.out.println("Initial values are :"+vector);
		      
		   // replace 'R' with 'Replace All'
		   Collections.replaceAll(vector, "R", "Replace All");
		      
		   System.out.println("Value after replace :"+ vector);
		   
		   ArrayList arrlst = new ArrayList();
		      
		   // populate the list
		   arrlst.add("A");
		   arrlst.add("B");
		   arrlst.add("C");
		   arrlst.add("D");
		   arrlst.add("E");

		   System.out.println("The initial list is :"+arrlst);
		      
		   // reverse the list
		   Collections.reverse(arrlst);
		      
		   System.out.println("The Reverse List is :"+arrlst);
		   
		   LinkedList<Integer> ll = new LinkedList<Integer>();  
		      
		   // populate the list 
		   ll.add(-28);  
		   ll.add(20);  
		   ll.add(-12);  
		   ll.add(8);  
		      
		   // create comparator for reverse order
		   Collections.sort(ll, Collections.reverseOrder());
				  
		   System.out.println("List sorted in ReverseOrder: ");      
		   for(int i : ll){
		   System.out.println(i+ " ");
		   }
		   Collections.sort(ll, Collections.reverseOrder(new myComparator()));
			  
		   System.out.println("List sorted in ReverseOrder: ");      
		   for(int i : ll){
		   System.out.println(i+ " ");
		   }
		   
		   List numbers = new ArrayList();
		      
		   // populate the list
		   for (int i = 0; i < 15; i++) {
		   numbers.add(i);
		   }

		   System.out.println("Before : "+Arrays.toString(numbers.toArray()));
		      
		   // rotate the list at distance 10
		   Collections.rotate(numbers, 10);

		   System.out.println("After : "+Arrays.toString(numbers.toArray()));
		   
		   List arrlist22 = new ArrayList();
		      
		   // populate the list
		   arrlist22.add("A");
		   arrlist22.add("B");
		   arrlist22.add("C");  
		      
		   System.out.println("Initial collection: "+arrlist22);
		      
		   // shuffle the list
		   Collections.shuffle(arrlist22);
		      
		   System.out.println("Final collection after shuffle: "+arrlist22);
		   
		   String init[] = { "One", "Two", "Three", "One", "Two", "Three" };
		      
		   // create two lists
		   List list11 = new ArrayList(Arrays.asList(init));
		   List list22 = new ArrayList(Arrays.asList(init));
		      
		   // remove from list1
		   list11.remove("One");
		   System.out.println("List1 value: "+list11);
		      
		   // remove from list2 using singleton
		   list22.removeAll(Collections.singleton("One"));		   
		   System.out.println("The SingletonList is :"+list22);
		   
		   
		   
		   
	}
}

class myComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		Integer a =  (Integer) o1;
		Integer b =  (Integer) o2;
		return a.compareTo(b);
	}
	
}
