package org.java.condition;

import java.util.Scanner;

public class ifEx5 {
	public static void main(String[] args) {
		System.out.println("조건이 여러개");

		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int i1 = scn.nextInt();

		if (i1 >= 90) {
			System.out.println("등급은 :" + "A" + "입니다");
		} else if (i1 >= 80) {
			System.out.println("등급은 :" + "B" + "입니다");
		} else if (i1 >= 70) {
			System.out.println("등급은 :" + "C" + "입니다");
		} else if (i1 >= 60) {
			System.out.println("등급은 :" + "D" + "입니다");
		} else {
			System.out.println("등급은 :" + "F" + "입니다");
		}

	}
}
