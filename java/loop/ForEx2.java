package org.java.loop;

import java.util.Scanner;

public class ForEx2 {
	public static void main(String[] args) {
		System.out.println("For문");
		for (int i = 2; i < 10; i++) {
			System.out.println(i + "단입니다.");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		// 9단부터 2단까지 구구단을 출력, for
		// 9*9 ~ 2*1 , 증감 i--
		for (int x = 9; x > 1; x--) {
			System.out.println(x + "단입니다.");
			for (int y = 9; y > 0; y--) {
				System.out.println(x + " * " + y + " = " + (x * y));
			}
		}

		System.out.println("==========");

		// Scanner 클래스 이용해서 시작단을 입력받아서 구구단을 입력단~9단까지 출력

		Scanner scn = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int i1 = scn.nextInt();

		System.out.println("끝단을 입력하세요");
		int q = scn.nextInt();

		System.out.println(i1 + " " + q);
		if (i1 > q) {
			System.out.println("시작단이 끝단보다 크거나 같아야됩니다");
		} else {
			for (int i = i1; i <= q; i++) {
				System.out.println(i1 + "단입니다.");
				for (int z = 1; z < 10; z++) {
					System.out.println(i + " * " + z + " = " + (i * z));
				}
			}
		}
	}
}
