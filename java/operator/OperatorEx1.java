package org.java.operator;

public class OperatorEx1 {
	public static void main(String[] args) {
		System.out.println("산술연산자");

		int num1 = 99;
		int num2 = 5;

		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		// System.out.println((double)num1/num2);
		System.out.println(num1 / num2);
		// 큰형 + 작은형 = 큰형
		System.out.println(num1 % num2);
	}
}
