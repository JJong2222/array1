package org.java.operator;

public class OperatorEx3 {
	public static void main(String[] args) {
		System.out.println("논리연산자");
		System.out.println("&& 모든 조건이 true일때만 true");

		String userId = "m1111";
		String userPw = "b1111";

		System.out.println(userId == "m1111" && userPw == "b1111");
		System.out.println(userId == "m1111" && userPw == "21111");
		System.out.println(userId == "m1112" && userPw == "11111");
		System.out.println(userId == "m1112" && userPw == "21111");

		if (userId == "m1111" && userPw == "b1111") {
			System.out.println("로그인 성공");
		} else {
			System.out.println("아이디 또는 비밀번호를 확인하세요.");
		}

		System.out.println("|| 하나이상의 조건이 true일때 true");

		// != id가 m1111이 아니냐? != pw가 b1111이 아니냐?
		if (userId != "m1111" || userPw != "b1111") {
			System.out.println("아이디 또는 비밀번호를 확인하세요.");
		} else {
			System.out.println("로그인 성공");
		}
	}
}