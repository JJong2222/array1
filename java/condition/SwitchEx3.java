package org.java.condition;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		
		System.out.println("switch문 3");
		
		Scanner scn = new Scanner(System.in);
		System.out.println("첫번째 숫자(정수) 입력");
		int num1 = scn.nextInt();

		System.out.println("두번째 숫자(정수) 입력");
		int num2 = scn.nextInt();

		System.out.println("연산 기호를 입혁하세요(+-*/)");
		String op = scn.next();

		switch (op) {
		case "+":
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
			break;
		case "/":
			System.out.println(num1 + "/" + num2 + "=" + ((double) num1 / num2));
			break;
		default:
			System.out.println("연산자 입력오류");
		}

	}
}
