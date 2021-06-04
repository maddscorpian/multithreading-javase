package com.app.test;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import com.app.runnable.CleanUpScheduler;

public class TestSchedulers {
	
	public static void main(String[] args) {
		ScheduledExecutorService ses = Executors.newSingleThreadScheduledExecutor();
		//ses.schedule(new CleanUpScheduler(), 5, TimeUnit.SECONDS);
		//ses.scheduleAtFixedRate(new CleanUpScheduler(), 5, 5, TimeUnit.SECONDS);
		ses.scheduleWithFixedDelay(new CleanUpScheduler(), 5, 5, TimeUnit.SECONDS);
	}

}
