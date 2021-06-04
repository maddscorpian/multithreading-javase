package com.app.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import com.app.dao.UserDao;
import com.app.runnable.UserProcessor;

public class TestExecutores {
	
	public static void main(String[] args) {
		
		// ExecutorService es = Executors.newSingleThreadExecutor();
		ExecutorService es = Executors.newSingleThreadExecutor();
		
		
		
		
		List<String> userList = getUserList();
		System.out.println("Total Users " + userList.size());
		UserDao dao = new UserDao();
		try {
			
			for (String string : userList) {
				System.out.println("Submiting user");
				Future<Integer> futures = es.submit(new UserProcessor(string, dao));
				System.out.println("Out Put " + futures.get());
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
		es.shutdown();
	}
	
	public static List<String> getUserList() {
		List<String> users = new ArrayList<>();
		try (BufferedReader br = new BufferedReader(new FileReader(
				"/Users/maddmachine/work/workspaces/java/learning/multi/src/test/resources/data/testdata.txt"))) {

			String sCurrentLine;
			while ((sCurrentLine = br.readLine()) != null) {
				users.add(sCurrentLine);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return users;
	}

}
