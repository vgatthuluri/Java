package org.avg.exercises.advanced.execsrvc;

public class MyThread implements Runnable {

	private String myName;
	private int count;
	private int sleepTime;
	

	public MyThread(String name, int cnt, int sleep) {
		this.myName = name;
		this.count = cnt;
		this.sleepTime = sleep;
	}
	
	
	@Override
	public void run() {
		int sum = 0;
		
		for(int i=0; i<this.count; i++){
			sum+=i;
		}
		
		System.out
				.println("My name is " + this.myName + "; count = "
						+ this.count + "; sum = " + sum + "; sleeping for "
						+ sleepTime);
	
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}
