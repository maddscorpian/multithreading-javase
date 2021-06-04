package com.app.test;

import com.app.runnable.AppThread;

public class TestThreads {
	
	public static void main(String[] args) {
		AppThread t1 = new AppThread(); // NEW
		AppThread t2 = new AppThread();
		AppThread t3 = new AppThread();
		
		t1.start(); // RUNNABLE 
		t2.start();
		t3.start();
		// Execution // Running
		// Done // Terminated. 
	}

}
