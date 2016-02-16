package concurrent;

import java.io.PrintStream;
import java.util.Date;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {

	public static void main(String[] args) {
		ScheduledExecutorService scheduledExecutorService =
		        Executors.newScheduledThreadPool(5);

		ScheduledFuture<?> scheduledFuture =
		    scheduledExecutorService.schedule(new Callable<Object>() {
		        public Object call() throws Exception {
		            System.out.println("Executed!");
		            return "Called!";
		        }
		    },2,TimeUnit.SECONDS);
		System.out.println("ScheduleFuture... "+scheduledFuture);
		 final ScheduledFuture<?> timeHandle =
				 scheduledExecutorService.scheduleAtFixedRate(new TimePrinter(System.out), 0, 1, TimeUnit.SECONDS);    
		 scheduledExecutorService.shutdown();
	}

}

class TimePrinter implements Runnable {

	  private PrintStream out;

	  public TimePrinter(PrintStream out) {
	    this.out = out;
	  }

	  public void run() {
		 
	    out.printf("Current time: %tr%n", new Date());
	  }
	}
