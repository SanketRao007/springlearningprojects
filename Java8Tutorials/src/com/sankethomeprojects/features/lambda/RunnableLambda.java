package com.sankethomeprojects.features.lambda;

public class RunnableLambda {

	public static void main(String[] args) throws InterruptedException {
		Runnable r = () -> {
			System.out.println("printing data");
		};
		Thread t = new Thread(r);
		t.start();
		t.join();
	}
}
