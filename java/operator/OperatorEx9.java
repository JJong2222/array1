package org.java.operator;

public class OperatorEx9 {

	public static void main(String[] args) {

		System.out.println("단항 연산자");

		int i = 10;
		// for문에서는 선처리 후증가 없음 똑같이 //
		// 선처리 후증가
		System.out.println(i++); // i:10
		System.out.println(i); // i:11

		// 선증가 후처리
		System.out.println(++i); // i:12
		System.out.println(i); // i:12

		// 선처리 후감소
		System.out.println(i--); // i:12
		System.out.println(i); // i:11

		// 선감소 후처리
		System.out.println(--i); // i:10
		System.out.println(i); // i:10

	}
}