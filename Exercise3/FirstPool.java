package Exercise3;

import java.util.concurrent.Executor;

public class FirstPool implements Executor {

	@Override
	public void execute(Runnable job) {
		//TODO: your code here
	}
	
	private static class DummyJob implements Runnable {
		public void run() {
			System.out.println("Doing dummy job in thread " + Thread.currentThread().getId());
		}
	}
	
	public static void main(String[] args) {
		FirstPool pool = new FirstPool();
		// all these jobs should be executed in the same thread
		for(int i = 0; i < 5; ++i) {
			pool.execute(new DummyJob());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		//all these jobs should be executed in different threads
		for(int i = 0; i < 5; ++i) {
			pool.execute(new DummyJob());
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
