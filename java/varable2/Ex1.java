package org.java.varable2;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {

		System.out.println("ÃÑÁ¡,Æò±Õ");

		Scanner scn = new Scanner(System.in);

		System.out.println("±¹¾îÁ¡¼ö :");
		int kor = scn.nextInt();

		System.out.println("¿µ¾îÁ¡¼ö :");
		int eng = scn.nextInt();

		System.out.println("¼öÇÐÁ¡¼ö :");
		int math = scn.nextInt();

		/*
		 * int sum=kor+eng+math; 
		 * double avg=(double)sum/3;
		 * System.out.println("ÃÑÁ¡ : "+sum); 
		 * System.out.println("Æò±Õ : "+avg);
		 */

		System.out.println("ÃÑÁ¡ :" + (kor + eng + math) + "Á¡");
		System.out.println("Æò±Õ :" + (kor + eng + math) / 3 + "Á¡");

	}
}
