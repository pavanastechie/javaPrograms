package concurrent;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newSingleThreadExecutor();

		executorService.execute(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task");
		    }
		});
		
		Future future = executorService.submit(new Runnable() {
		    public void run() {
		        System.out.println("Asynchronous task1");
		    }
		});

		future.get(); 
		
		Future future1 = executorService.submit(new Callable(){
		    public Object call() throws Exception {
		        System.out.println("Asynchronous Callable");
		        return "Callable Result";
		    }
		});

		System.out.println("future1.get() = " + future1.get());
		
		Set<Callable<String>> callables = new HashSet<Callable<String>>();

		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 1";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 2";
		    }
		});
		callables.add(new Callable<String>() {
		    public String call() throws Exception {
		        return "Task 3";
		    }
		});

		String result = executorService.invokeAny(callables);
		
		List<Future<String>> futures = executorService.invokeAll(callables);		

		System.out.println("result = " + result);
		for(Future<String> future11 : futures){
		    System.out.println("future.get = " + future11.get());
		}

		executorService.shutdown();

	}

}
