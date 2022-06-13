package org.java.varable;
//import java.lang.System;

// java.lang패키지 안의 클래스는 자동으로 import

public class HellowWorld {
	// 접급지정자(접근 제한자)
	// class 예약어(키워드)
	// HellowWorld 클래스 명(첫글자 대문자)
	public static void main(String[] args) {

		// 시스템 콘솔창에 한줄씩 출력 하시오.
		System.out.println("Hellow World");
		System.out.println(100);
		System.out.println(false);
		System.out.println('a');
		System.out.println(1.1f);

		int result = 1 + 2;
		System.out.println(result);

		result = result - 1;
		System.out.println(result);

		result = result / 2;
		System.out.println(result);

		result = result * 5;
		System.out.println(result);

	}

}
