package com.survivalcoding;


import java.util.Scanner;

public class Algo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int R = scanner.nextInt();
		int N = scanner.nextInt();

		int[] x = new int[N];
		int[] y = new int[N];

		for (int i = 0; i < N; i++) {
			x[i] = scanner.nextInt();
			y[i] = scanner.nextInt();
		}

		for (int i = 0; i < N; i++) {
			if (((x[i] - a) * (x[i] - a) + (y[i] - b) * (y[i] - b)) >= R * R) {
				System.out.println("silent");
			} else {
				System.out.println("noisy");
			}
		}
	}
}


