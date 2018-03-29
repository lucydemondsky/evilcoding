package outofmemory;

public class JavaVMStackOOM {
	private void dostop() {
		while(true) {
			
		}
	}
	
	public void stackLeakByThread() {
		while(true) {
			Thread thread = new Thread(new Runnable() {

				@Override
				public void run() {
					dostop();			//when one thread come in, it would while loop forever.
										//CPU would exhausted.
				}
				
			});
			thread.start();
		}
	}
	public static void main(String[] args) {
		JavaVMStackOOM oom = new JavaVMStackOOM();
		oom.stackLeakByThread();

	}

}
