package designpattern.creational;

class SingleObject {
	private static SingleObject instance = new SingleObject();
	
	public static SingleObject getInstance() {
		return instance;
	}
	
	public void getMsg() {
		System.out.println("Hello Wolrd!!");
	}
}


public class SingletonPattern {
	
	public static void main(String[] args) {
		SingleObject s = SingleObject.getInstance();
		s.getMsg();
	}
}
