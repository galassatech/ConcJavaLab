package Exercise4;

import java.io.File;

/**
 * Sequential version of letter statistics
 *
 */
public class SimpleStatistics extends Statistics {
	private int[] letterStats = new int['z'-'a'+1];
	
	private void initStats() {
		for (int i = 0; i < letterStats.length; i++) {
			letterStats[i] = 0;
		}
	}
	
	private void mergeStats(int[] newStats) {
		for (int i = 0; i < letterStats.length; i++) {
			letterStats[i] += newStats[i];
		}
	}
	
	public int[] getStatistics(String dirName) {
		initStats();
		File dir = new File(dirName);
		if (dir.isDirectory()) visitDirectory(dir);
		return letterStats;
	}
	
	private void visitDirectory(File dir) {
		String[] children = dir.list();
		for (String child : children) {
			File f = new File(dir, child);
			if (f.isFile()) {
				mergeStats(FileInspector.run(f));
			} else if (f.isDirectory()) {
				visitDirectory(f);
			}
		}
	}
	
	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println("Usage: Exercise1.Statistics dir_name"); return;
		}
		
		SimpleStatistics stat = new SimpleStatistics();
		stat.test(args[0]);
	}
}
