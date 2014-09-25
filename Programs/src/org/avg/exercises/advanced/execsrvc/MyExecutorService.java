package org.avg.exercises.advanced.execsrvc;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyExecutorService {

	
	public void testExecute(){
		try{
			
			ExecutorService executor = Executors.newFixedThreadPool(2);
			
			for(int i=0 ; i<10; i++){
				System.out.println("starting "+i+" thread");
				executor.submit(new MyThread("Thread-"+i, i, i*1000));
			}
			
			System.out.println("started all threads.... waiting them to complete....calling shutdown...");
			//this will make sure no more threads will be added and also wait till all completes
			executor.shutdown();
			System.out.println("after shutdown...");
			
			executor.awaitTermination(1, TimeUnit.MINUTES);
			System.out.println("after termination....");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			System.out.println("END");
		}
	}
	
	
	public static void main(String args[]){

		MyExecutorService es = new MyExecutorService();
		es.testExecute();
		
	}
	
	
	
}
