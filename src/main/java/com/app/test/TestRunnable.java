package com.app.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestRunnable {
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
		
		Thread t1 = new Thread(r1);
		t1.start();
	}

}
