package com.cg.iter;

public class DiffLab1Ex2 {
	static int calculateDifference(int n) {

		int a, b, m;

		a = (n * (n + 1) * (2 * n + 1)) / 6;

		b = (n * (n + 1)) / 2;

		b = b * b;

		m = Math.abs(a - b);

		return m;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 4;
		System.out.println(calculateDifference(n));

	}

}
