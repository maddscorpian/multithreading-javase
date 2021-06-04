package com.app.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import com.app.runnable.CustomThreadFactory;
import com.app.runnable.LoggingProcessor;

public class TestThreadFactory {
public static void main(String[] args) {
	ExecutorService es = Executors.newFixedThreadPool(5, new CustomThreadFactory());
	
	for (int i = 0; i < 5 ; i ++) {
		es.submit(new LoggingProcessor());
		
	}
}
}
