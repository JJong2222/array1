package org.java.varable2;

import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		System.out.println("if문 예제");

		System.out.println("국어, 영어, 수학 점수를 입력, 총점, 평균 ,학점(평균) ");
		// 스캐너 이용해서 if문 이용
		// 국어,영어,수학(0~100정수) , 총점(정수), 평균(double)
		// 평균(double)를 이용해서 학점 계산
		// 95이상 A+ 90이상 A

		Scanner scn = new Scanner(System.in);
		System.out.println("국어점수를 입력하세요");
		int kor = scn.nextInt();

		System.out.println("영어점수를 입력하세요");
		int eng = scn.nextInt();

		System.out.println("수학점수를 입력하세요");
		int math = scn.nextInt();

		int sum = kor + eng + math;
		double avg = (double) sum / 3;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);

		if (avg >= 90) {
			if (avg >= 95) {
				System.out.println("등급은 :" + "A+" + "입니다");
			} else {
				System.out.println("등급은 :" + "A" + "입니다");
			}
		} else if (avg >= 80) {
			if (avg >= 85) {
				System.out.println("등급은 :" + "B+" + "입니다");

			} else {
				System.out.println("등급은 :" + "B" + "입니다");
			}
		} else if (avg >= 70) {
			if (avg >= 75) {
				System.out.println("등급은 :" + "C+" + "입니다");
			} else {
				System.out.println("등급은 :" + "C" + "입니다");
			}
		} else if (avg >= 60) {
			if (avg >= 65) {
				System.out.println("등급은 :" + "D+" + "입니다");
			} else {
				System.out.println("등급은 :" + "D" + "입니다");
			}

		} else {
			System.out.println("등급은 :" + "F" + "입니다");
		}
	}
}
