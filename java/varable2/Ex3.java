package org.java.varable2;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("단 입력");
		int i = scn.nextInt();

		System.out.println("끝단 입력");
		int j = scn.nextInt();

		if (i > j) {

		} else {
			for (int i1 = i; i1 <= j; i1++) {
				System.out.println(i1 + "단입니다.");
				for (int i2 = 1; i2 < 10; i2++) {
					System.out.println(i1 + " * " + i2 + "=" + (i1 * i2));
				}
			}
		}

	}
}
