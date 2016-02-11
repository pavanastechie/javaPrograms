import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	
 public static void main(String[] args){
	 ArrayList<String> dayNames = new ArrayList<String>();
	    dayNames.add("Sunday");
	    dayNames.add("Monday");
	    dayNames.add("Tuesday");
	    dayNames.add("Wednesday");
	    dayNames.add("Thursday");
	    dayNames.add("Friday");
	    dayNames.add("Saturday");
	    
	    Iterator<String> itr = dayNames.iterator();
	    String d="";
	    while(itr.hasNext()){
	    	//System.out.println((String)itr.next());
	    	d = itr.next();
	    	
	    	if(d.equals("Monday")){
	    		itr.remove();
	    	}
	    }
	    System.out.println(dayNames);
 }
}
