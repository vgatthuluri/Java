package org.avg.exercises.advanced.threads;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SubmitExecutorService {

	
	public void testSubmit(){
		try{
			
			ExecutorService executor = Executors.newFixedThreadPool(10);
			List<Future<String>> results = new LinkedList<Future<String>>();
			for(int i=0; i<10; i++){
				Future<String> result = executor.submit(new CallableTask(i, "Task-"+i, i*10, i*100));
				results.add(result);
			}
			
//			Thread.sleep(3000);
			for(Future<String> result : results){
				String str = result.get();
				System.out.println("str="+str);
			}
			
			System.out.println("calling shutdown....");
			executor.shutdown();
			System.out.println("done shutdown....wating for 100 sec.");
			executor.awaitTermination(100, TimeUnit.SECONDS);
			System.out.println("END");
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public static void main(String args[]){
		SubmitExecutorService service = new SubmitExecutorService();
		service.testSubmit();
	}
	
	
}
