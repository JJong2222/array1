package org.java.loop;

import java.util.Scanner;

public class WhileEx2 {
	public static void main(String[] args) {
		System.out.println("While문 구구단");

		int i = 2;
		while (i < 10) {
			System.out.println(i + "단입니다.");

			int j = 1;
			while (j < 10) {
				System.out.println(i + "*" + j + "=" + (i * j));
				j++;
			}
			i++;
		}
		System.out.println("==============");

		// 스캐너에서 입력단(정수)를 이용해서 구구단을 출력
		// 예)4입력하면 4단부터 9단까지 출력

		System.out.println("단을 입력하세요.");
		Scanner scn = new Scanner(System.in);
		int x = scn.nextInt();

		int i2 = x;
		while (i2 < 10) {
			System.out.println(i2 + "단입니다.");

			int y = 1;
			while (y < 10) {

				System.out.println(i2 + "*" + y + "=" + (i2 * y));
				y++;
			}
			i2++;
		}

	}
}
