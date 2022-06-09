package com.survivalcoding;

import java.util.Scanner;

public class Algo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		String[] strs = new String[number];
		for (int i = 0; i < number; i++)
			strs[i] = in.next();

		System.out.print("Hello ");
		
		for (int i = 0; i < number; i++)
			System.out.print(strs[i]+ ".");
	}
}

