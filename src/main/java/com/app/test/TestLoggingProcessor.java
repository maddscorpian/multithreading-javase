package com.app.test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import com.app.runnable.LoggingProcessor;

public class TestLoggingProcessor {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		
		
		List<Callable<Boolean>> clist = new ArrayList<Callable<Boolean>>();
		clist.add(new LoggingProcessor());
		clist.add(new LoggingProcessor());
		clist.add(new LoggingProcessor());
		clist.add(new LoggingProcessor());
		clist.add(new LoggingProcessor());
		clist.add(new LoggingProcessor());
		clist.add(new LoggingProcessor());
		try {
			
			List<Future<Boolean>> results = es.invokeAll(clist);
			
			for (Future<Boolean> f : results) {
				System.out.println("Result --- " + f.get());
			}
			es.shutdown();
			es.awaitTermination(50, TimeUnit.SECONDS);
		}catch (Exception e) {
			// TODO: handle exception
		}
		
	}
}
