package Exercise4;

public abstract class Statistics {
	public abstract int[] getStatistics(String dirName);
	
	public void test(String dirName) {
		long startTime = System.currentTimeMillis();
		int[] dirStatistics = getStatistics(dirName);
		long finishTime = System.currentTimeMillis();
		int sum = 0;
		for(int i : dirStatistics) sum += i;
		
		for(char c = 'a'; c <= 'z'; c++) {
			System.out.println("Letter " + c + " statistics: " + ((float)dirStatistics[c-'a']) / sum * 100 + "%");
		}
		System.out.println("The time of work: " + (finishTime - startTime) + " ms");
	}
}
