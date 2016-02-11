package designpattern.creational;
/*
 * In Factory pattern, we create object without exposing the creation logic to the 
 * client and refer to newly created object using a common interface.
 */
 interface Shape{
	 void draw();
 }
 
 class Circle implements Shape {
	 
	 @Override
	 public void draw() {
		 System.out.println("Drawn a Circle");
	 }
 }
 
 class Rectangle implements Shape {
	 
	 @Override
	 public void draw() {
		 System.out.println("Drawn a Rectangle");
		 
	 }
 }
 
 class Square implements Shape {
	 
	 @Override
	 public void draw() {
		 System.out.println("Drawn Square");
	 }
	 
 }
 
 public class FactoryPattern {
	 
	 public Shape getShape(String shape) {
		 if(shape ==null){
			 return null;
		 }
		 else if(shape.equalsIgnoreCase("CIRCLE")) {
			 return new Circle();
		 }
		 else if(shape.equalsIgnoreCase("RECTANGLE")) {
			 return new Rectangle();
		 }
		 else if(shape.equalsIgnoreCase("SQUARE")) {
			 return new Square();
		 }
		 
		 return null;
		 		 
	 }
	 
	 public static void main(String[] args) {
		 FactoryPattern fp =new FactoryPattern();
		 Shape s1 = fp.getShape("CIRCLE");
		 s1.draw();
		 Shape s2 = fp.getShape("RECTANGLE");
		 s2.draw();
		 Shape s3 = fp.getShape("SQUARE");
		 s3.draw();		 
	 }
	 
 }