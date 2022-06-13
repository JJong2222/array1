package org.java.Scanner;

import java.util.Scanner;

public class ScannerEx2 {
	public static void main(String[] args) {

		System.out.println("쿼리문을 입력하세요");
		
		Scanner scn= new Scanner(System.in);
		
		
		String str = scn.nextLine();
		
		
		if(str.equals("insert")) {
			System.out.println("회원가입 페이지로 이동합니다");
		} else if (str.equals("update")) {
			System.out.println("회원수정 페이지로 이동합니다");
		} else if (str.equals("select")) {
			System.out.println("회원조회 페이지로 이동합니다");
		} else if (str.equals("delete")) {
			System.out.println("회원탈퇴 페이지로 이동합니다");
		}
	}
}
