package Exercise1;

public class ComputationTask {
	
	public int compute() {
		return calculate(3, 8);
	}
	
	private int calculate (int m, int n){
		if (m==0) return n+1;
		else if (n==0 && m>0) return calculate(m-1,1);
		else if (m>0 && n>0) return calculate(m-1, calculate(m,n-1));
		else return -1;
	}
}
