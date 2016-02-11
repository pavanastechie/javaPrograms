package concurrent;

import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* ConcurrentHashMap behaves the same as HashMap in java. But ConcurrentHashMap is used in multi threading environment. HashMap throws error if two threads are modifying it at the same time but ConcurrentHashMap keeps the integrity of the map. ConcurrentHashMap belongs to the package java.util.concurrent. ConcurrentHashMap has been introduced in jdk 1.5. Find the sample example of ConcurrentHashMap. */


public class ConcurrentHashMapExample implements Runnable {
	private String name;
	  private static Map<String,String> conpage=new ConcurrentHashMap<String,String>();
	  
	  ConcurrentHashMapExample(String name){
		  conpage.put("1","A");
		  conpage.put("2","B");
		  conpage.put("3","C");
		  this.name=name;
	  }
	  public void run() {
		try{
		  Iterator<String> it = conpage.keySet().iterator();
	  	  while(it.hasNext()){
			String key=it.next();
			conpage.put("A"+key, "A"+key);
		  }
		  System.out.println(name +" completed.");
		}catch(Exception e){
			  e.printStackTrace();
		}finally{
		}
	  }
	  public static void main(String[] args) {
		  ExecutorService  executor= Executors.newCachedThreadPool();
		  executor.execute(new ConcurrentHashMapExample("Thread one"));
		  executor.execute(new ConcurrentHashMapExample("Thrad two"));
		  executor.shutdownNow();
	  }
}