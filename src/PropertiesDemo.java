import java.util.Enumeration;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		Properties p = new Properties();
		p.setProperty("Pavan", "ASE");
		p.setProperty("Pavan", "ASE");
		p.setProperty("Kiran", "SystemsAnalyst");
		System.out.println(p.getProperty("Pavan"));
		Enumeration<?> e = p.propertyNames();
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		//load()
		//store()
		Properties p1 = new Properties(p);
	}
}
