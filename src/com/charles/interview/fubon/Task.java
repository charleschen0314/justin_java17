package com.charles.interview.fubon;

public class Task {
	String title;
	static class Counter{
		int counter =0;
		void increment() {counter++;}
	}

	public static void main(String[] args) {
		new Task.Counter().increment();

	}

}
