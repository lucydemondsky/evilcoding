package thread;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class ThreadDead implements Runnable{
	
	int a;
	int b;
	public ThreadDead(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void run() {
		synchronized (Integer.valueOf(a)) {
			synchronized (Integer.valueOf(b)) {
				System.out.println("a=" + a + "b=" + b);
				System.out.println("new ");
				
			}
		}
	}
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			new Thread(new ThreadDead(1, 2)).start();
			new Thread(new ThreadDead(2, 1)).start();
		}
	}

}
