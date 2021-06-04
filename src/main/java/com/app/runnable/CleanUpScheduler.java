package com.app.runnable;

import java.io.File;

public class CleanUpScheduler implements Runnable{

	@Override
	public void run() {
		File folder = new File("/Users/maddmachine/work/workspaces/java/learning/multi/src/test/resources/data");
		File[] files = folder.listFiles();
		for (File file : files) {
			System.out.println("File Name " + file.getName());
		}
		
	}

}
