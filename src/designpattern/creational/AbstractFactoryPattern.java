package designpattern.creational;

	interface Shape1{
		void draw();
	}

	class Rectangle1 implements Shape1 {
		@Override
		public void draw() {
			System.out.println("Drawn Rectangle");
		}
	}
	
	 class Circle1 implements Shape1 {
		 @Override
		 public void draw() {
			 System.out.println("Drawn Circle");
		 }
	 }
	 
	 class Square1 implements Shape1 {
		 
		 @Override
		 public void draw() {
			 System.out.println("Drawn Square");
		 }
	 }
	 
	 interface Color {
		 void fill();
	 }
	 
	 class Red implements Color {
		 @Override
		 public void fill() {
			 System.out.println("Filled with Red");
		 }
	 }
	 
	 class Green implements Color {
		 @Override
		 public void fill() {
			 System.out.println("Filled with Green");
		 }
	 }
	 
	 class Yellow implements Color {
		 @Override
		 public void fill() {
			 System.out.println("Filled With Yellow");
		 }
		 
	 }
	 
	 abstract class AbstractFactory {
		 abstract Color getColor(String shape);
		 abstract Shape1 getShape(String color);
	 }
	 
	 class ShapeFactory extends AbstractFactory {
		 @Override
		 public Shape1 getShape(String shape) {
			 if(shape == null){
				 return null;
			 }
			 else if(shape.equalsIgnoreCase("CIRCLE")) {
				 return new Circle1();
				 
			 }
			 else if(shape.equalsIgnoreCase("RECTANGLE")) {
				 return new Rectangle1();
			 }
			 else if(shape.equalsIgnoreCase("SQUARE")){
				 return new Square1();
			 }			 
			 return null;
		 }
		 @Override
		 public Color getColor(String color) {
			 return null;
		 }
	 }
	 
	 class ColorFactory extends AbstractFactory {
		 @Override
		 public Color getColor(String c) {
			 if(c == null) {
				 return null;
			 }
			 else if(c.equalsIgnoreCase("RED")) {
				 return new Red();
			 }
			 else if(c.equalsIgnoreCase("YELLOW")) {
				 return new Yellow();
			 }
			 else if(c.equalsIgnoreCase("Green")) {
				 return new Green();
			 }
			 return null;
		 }
		 
		 @Override
		 public Shape1 getShape(String shape) {
			 return null;
		 }
	 }
public class AbstractFactoryPattern {

	public static void main(String[] args) {
		
		ShapeFactory sf = new ShapeFactory();
		Shape1 s1 = sf.getShape("CIRCLE");
		s1.draw();
		Shape1 s2 = sf.getShape("SQUARE");
		s2.draw();
		Shape1 s3 = sf.getShape("RECTANGLE");
		s3.draw();
		ColorFactory cf = new ColorFactory();
		Color c1 = cf.getColor("RED");
		c1.fill();
		Color c2 = cf.getColor("YELLOW");
		c2.fill();
		Color c3 = cf.getColor("GREEN");
		c3.fill();
	}

}
