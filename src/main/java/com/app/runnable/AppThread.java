package com.app.runnable;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AppThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside RUn");
		try (BufferedReader br = new BufferedReader(new FileReader(
				"/Users/maddmachine/work/workspaces/java/learning/multi/src/test/resources/data/testdata.txt"))) {

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println("Thread name " + Thread.currentThread() + " Reading line " + sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
