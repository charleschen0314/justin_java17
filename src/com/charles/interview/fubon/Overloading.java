package com.charles.interview.fubon;

public class Overloading {

	int x(int d) {
		System.out.println("one");
		return 0;
	}

	String x(String d) {
		System.out.println("two");
		return null;
	}

	double x(double d) {
		System.out.println("three");
		return 0.0;
	}

	public static void main(String[] args) {
		new Overloading().x(4.0);

	}

}
