package com.charles.interview.fubon;

public class C {
	
	static void m(int[] i) {
		i[0] += 7;
	}

	public static void main(String[] args) {
		int[] j = new int[1];
		j[0] = 12;
		m(j);
		System.out.println(j[0]);
	}

}
