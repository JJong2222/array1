package org.java.condition;

public class ifEx7 {
	public static void main(String[] args) {

		int num1 = 10;

		if (num1 > 10) {
			System.out.println("10보다 큽니다.");
		}

		if (num1 > 10) {
			System.out.println("10보다 큽니다.");
		} else {
			System.out.println("10보다 크지않습니다.");
		}
		System.out.println("============");

		if (num1 > 10)
			System.out.println("10보다 큽니다.");
		else
			System.out.println("10보다 크지 않습니다.");

		System.out.println("==========");
		if (num1 > 10) {
			System.out.println("10보다 큽니다.");
		} else if (num1 > 0) {
			System.out.println("0보다 큽니다");
		} else {
			System.out.println("0보다 크지않습니다.");
		}

		System.out.println("java2022".charAt(0));// 문자열0번지
		System.out.println("java2022".charAt(1));// 문자열1번지
		System.out.println("java2022".charAt(2));// 문자열2번지
		System.out.println("java2022".charAt(3));// 문자열3번지
		System.out.println("java2022".charAt(4));// 문자열4번지

	}
}
