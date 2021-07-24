package moop;

public class Class  implements Runnable {
	

	public Class() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
	System.out.println("Thread is Running");	
	Thread t1 = new Thread(new Class ());
	t1.start();
	
	}

}
