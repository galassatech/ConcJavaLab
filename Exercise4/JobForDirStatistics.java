package Exercise4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Concurrent statistics: each directory visit is a separate job.
 * When traversing the directory, each new subdirectory is inserted to the executor as a new job.
 * Each file inspection results are merged into the global array of statistics
 *
 */
public class JobForDirStatistics {
	
	private AtomicInteger[] letterStats = new AtomicInteger['z'-'a'+1];
	private final ExecutorService executor = Executors.newFixedThreadPool(8);
	
	static private class Job implements Runnable {
		@Override
		public void run() {
			//TODO: your code for traversing the directory and inspecting the files
			//TODO: each new subdirectory should be submitted as a separate job
		}
	}
	
	public int[] getStatistics(String dirName) {
		//TODO: create the job of traversing the directory and submit it
		//TODO: wait till all the jobs finish
		//(note that you cannot just shutdown the executor because it will prevent from 
		//the current jobs to submit the new ones)
		return null;
	}
	
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: Exercise1.Statistics dir_name"); return;
		}
		long startTime = System.currentTimeMillis();
		JobForDirStatistics stat = new JobForDirStatistics();
		int[] dirStatistics = stat.getStatistics(args[0]);
		long finishTime = System.currentTimeMillis();
		int sum = 0;
		for(int i : dirStatistics) sum += i;
		
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.println("Letter " + c + " statistics: " + ((float)dirStatistics[c-'a']) / sum * 100 + "%");
		}
		System.out.println("The time of work: " + (finishTime - startTime) + " ms");
	}
}

