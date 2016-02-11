import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorDemo {
	public static void main(String[] a) {
		ArrayList<String> dayNames = new ArrayList<String>();
		dayNames.add("Sunday");
		dayNames.add("Monday");
		dayNames.add("Tuesday");
		dayNames.add("Wednesday");
		dayNames.add("Thursday");
		dayNames.add("Friday");
		dayNames.add("Saturday");
		ListIterator<String> l = dayNames.listIterator();
		while (l.hasNext()) {
			System.out.println(l.next()+"----------"+l.nextIndex());
		}
		System.out.println("------------");
		while(l.hasPrevious()){
			System.out.println(l.previous()+"-------"+l.previousIndex());
		}
		
		while(l.hasNext()){
			if(l.next() == "Monday"){
				l.set("Sad :( Monday");
			}
				
		}
		
		while(l.hasPrevious()){
			if(l.previous() == "Sunday"){
				l.remove();
			}
		}
		System.out.println("------------");		
		System.out.println(dayNames);
	}

}
