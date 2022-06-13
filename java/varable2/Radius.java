package org.java.varable2;

import java.util.Scanner;

public class Radius {

	public static void main(String[] args) {
		/*
		 * 반지름(정수)를 입력해서 원의 넓이를 구하세요 결과값 콘솔에 출력 원주율 PI=3.14(final 상수) 반지름 radius 원의넓이 =
		 * 반지름*반지름*PI Scanner, nextInt 이용
		 */

		System.out.println("원을 넓이를 구하시오");

		Scanner scn = new Scanner(System.in);
		final double PI = 3.14;

		System.out.println("반지름 입력하세요(정수형)");
		int radius = scn.nextInt();

		// double circleNum=radius*radius*PI;
		int circleNum = (int) (radius * radius * PI);

		System.out.println(radius + "*" + radius + "*" + PI + "=" + (radius * radius * PI));
		System.out.println("원의 넓이 : " + circleNum);

	}

}
