package Exercise4;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Concurrent statistics: each file inspection is a separate job
 * File inspection results are merged into the global array of statistics
 *
 */
public class JobForFileStatistics extends Statistics{
	
	private AtomicInteger[] letterStats = new AtomicInteger['z'-'a'+1];
	private final ExecutorService executor = Executors.newFixedThreadPool(8);

	
	static private class Job implements Runnable {
		public void run() {
			// TODO: your code for inspecting the file and merging the results
		}
	}
	
	public int[] getStatistics(String dirName) {
		//TODO: traverse the directories, create and submit the jobs
		//TODO: wait till all the jobs finish and return the result
		return null;
	}
	
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: Exercise1.Statistics dir_name"); return;
		}
		JobForFileStatistics stat = new JobForFileStatistics();
		stat.test(args[0]);
	}
}
