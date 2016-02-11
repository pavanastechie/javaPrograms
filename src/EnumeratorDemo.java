import java.util.Enumeration;
import java.util.Vector;

public class EnumeratorDemo {
	
	public static void main(String[] args){
	Vector<String> dayNames = new Vector<String>();
    dayNames.add("Sunday");
    dayNames.add("Monday");
    dayNames.add("Tuesday");
    dayNames.add("Wednesday");
    dayNames.add("Thursday");
    dayNames.add("Friday");
    dayNames.add("Saturday");
    Enumeration e = dayNames.elements();
    while(e.hasMoreElements()){
    	System.out.println(e.nextElement());
    }
	}

}
