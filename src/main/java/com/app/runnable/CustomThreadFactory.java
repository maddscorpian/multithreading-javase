package com.app.runnable;

import java.util.concurrent.ThreadFactory;

public class CustomThreadFactory implements ThreadFactory{
	
	private static int CNT = 0;

	@Override
	public Thread newThread(Runnable r) {
	
		
		Thread thread = new Thread(r);
		thread.setName("MyThread-"+CNT++);
		return thread;
	}

}
