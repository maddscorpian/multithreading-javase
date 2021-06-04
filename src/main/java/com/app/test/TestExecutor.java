package com.app.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class TestExecutor {
	
	public static void main(String[] args) {
		Runnable r1 = () -> {
			try (BufferedReader br = new BufferedReader(new FileReader(
					"/Users/maddmachine/work/workspaces/java/learning/multi/src/test/resources/data/testdata.txt"))) {

				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null) {
					System.out.println("Thread name " + Thread.currentThread() + " Reading line " + sCurrentLine);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		};
		
		Executor ex = Executors.newSingleThreadExecutor();
		ex.execute(r1);
	}

}
