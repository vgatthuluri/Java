package org.avg.exercises.advanced.threads.;

public class SimpleThread implements Runnable {

	private String name;
	private int id;
	private int count;
	private int sum;
	private int sleepTime;

	public SimpleThread(int id, String name, int count, int sleepTime ){
		this.name = name;
		this.id = id;
		this.count = count;
		this.sleepTime = sleepTime;
	}
	
	@Override
	public String toString() {
		return "Thread:[id:" + id + ", name:" + name 
				+ ", count:" + count + ", sum:" + sum + ", sleepTime:"
				+ sleepTime+"]";
	}

	@Override
	public void run() {
		for(int i=0;i<count;i++){
			sum+=i;
		}
		System.out.println(this.toString()+" :: Sleeping...");
		try {
			Thread.sleep(sleepTime);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.toString()+" finished.");
	}
}
