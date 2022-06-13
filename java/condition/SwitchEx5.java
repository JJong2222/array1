package org.java.condition;

import java.util.Scanner;

public class SwitchEx5 {
	public static void main(String[] args) {

		System.out.println("switch문 5");

		Scanner scn = new Scanner(System.in);
		System.out.println("정수를 입력하세요");
		int num = scn.nextInt();
		char grade = ' ';
		switch (num / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		case 5:
			grade = 'E';
			break;
		default:
			grade = 'F';

		}
		System.out.println("학점은 :" + grade + "입니다");
	}
}
