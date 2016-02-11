package designpattern.creational;

import java.util.Hashtable;

abstract class Shape2 implements Cloneable {
	private String id;
	protected String type;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Object clone() {
		Object clone = null;
		try {
			clone = super.clone(); 
		}
		catch(CloneNotSupportedException e){
			e.printStackTrace();
		}
		return clone;
	}
	
	abstract void draw();
}

class Rectangle2 extends Shape2 {
	
	public Rectangle2() {
		type = "Rectangle";
	}

	@Override
	public void draw() {
		System.out.println("Drawn Rectangle...");
		
	}
	
}

class Square2 extends Shape2 {
	public Square2() {
		
		type="Square";
	
	}
	
	@Override
	public void draw() {
		System.out.println("Drawn Square");
	}
}

class Circle2 extends Shape2 {
	
	public Circle2() {
		type= "Circle";
	}
	
	@Override
	public void draw() {
		System.out.println("Drawn a Circle");
	}
}

class ShapeCache {
	private static Hashtable<String,Shape2> sp = new Hashtable<String, Shape2>();
	
	public static Shape2 getShape(String shapeId) {
		
		Shape2 cs =sp.get(shapeId);
		return (Shape2)  cs.clone();
	}
	
	public static void loadCache() {
		
		Circle2 c = new Circle2();
		c.setId("1");
		sp.put(c.getId(), c);
		
		Rectangle2 r = new Rectangle2();
		r.setId("3");
		sp.put(r.getId(), r);
		Square2 s = new Square2();
		s.setId("2");
		sp.put(s.getId(), s);
		
	}
	
}
public class PrototypePattern {

	public static void main(String[] args) {
		ShapeCache.loadCache();
		
		Shape2 cs = (Shape2) ShapeCache.getShape("1");
		System.out.println("Shape: "+cs.getType());
		
		Shape2 cs1 = (Shape2) ShapeCache.getShape("2");
		System.out.println("Shape: "+cs1.getType());
		
		Shape2 cs2 = (Shape2) ShapeCache.getShape("3");
		System.out.println("Shape: "+cs2.getType());
	}

}
