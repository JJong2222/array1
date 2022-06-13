package org.java.condition;

import java.util.Scanner;

public class ifEx6 {
	public static void main(String[] args) {
		System.out.println("조건문 if");

		Scanner scn = new Scanner(System.in);
		System.out.println("점수를 입력하세요");
		int i1 = scn.nextInt();

		if (i1 >= 90) {
			if (i1 >= 95) {
				System.out.println("등급은 :" + "A+" + "입니다");
			} else {
				System.out.println("등급은 :" + "A" + "입니다");
			}
		} else if (i1 >= 80) {
			if (i1 >= 85) {
				System.out.println("등급은 :" + "B+" + "입니다");
			} else {
				System.out.println("등급은 :" + "B" + "입니다");
			}
		}

		else if (i1 >= 70) {
			if (i1 >= 75) {
				System.out.println("등급은 :" + "C+" + "입니다");
			} else {
				System.out.println("등급은 :" + "C" + "입니다");
			}
		} else if (i1 >= 60) {
			if (i1 >= 65) {
				System.out.println("등급은 :" + "D+" + "입니다");
			} else {
				System.out.println("등급은 :" + "D" + "입니다");
			}
		} else {
			System.out.println("등급은 :" + "F" + "입니다");
		}
	}
}
