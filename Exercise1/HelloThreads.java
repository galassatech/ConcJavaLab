package Exercise1;

import java.util.concurrent.atomic.AtomicInteger;

public class HelloThreads {
	public static void execute(int numTasks, int numThreads) {
		ComputationTask tasks[] = new ComputationTask[numTasks];
		for(int i = 0; i < numTasks; i++) {
			tasks[i] = new ComputationTask();
		}
		
		/*
		 * TODO Here your code for executing task in threads
		 *  Hint: use anonymous functions
		 */
	}


	
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		if (args.length < 2){
			System.out.println("Usage: HelloThreads <number of tasks> <number of threads>");
			return;
		}
		
		int numTasks = Integer.parseInt(args[0]);
		int numThreads = Integer.parseInt(args[1]);
		
		execute(numTasks, numThreads);
		
		long finishTime = System.currentTimeMillis();
		System.out.println("Excecution time: "+(finishTime-startTime)+" ms");		
	}
}
