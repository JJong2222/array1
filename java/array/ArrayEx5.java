package org.java.array;

public class ArrayEx5 {
	public static void main(String[] args) {
		System.out.println("배열");
		// int[][] arr1={}
		int[][] arr1 = new int[][] {

				{ 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				System.out.print(arr1[i][j] + " ");
			}
			System.out.println();
		}
		int[][] score = { { 100, 66, 77 }, { 88, 66, 88 }, { 80, 46, 97 }, { 70, 88, 80 }, { 100, 90, 88 } };
		int k = 0;
		int m = 0;
		int e = 0;
		double a1 = 0.0;
		int totalsum = 0;

		int num = 0;
		System.out.println("중간고사 성적표");
		System.out.println("번호\t국어\t수학\t영어\t총점\t평균");
		System.out.println("=============================================");
		for (int i = 0; i < score.length; i++) {

			int s = 0;

			k += score[i][0];
			m += score[i][1];
			e += score[i][2];

			System.out.print(++num + "\t ");
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				s += score[i][j];
				totalsum += score[i][j];
			}

			a1 = Math.round((double) s / score[i].length);
			System.out.println(s + "\t" + a1);

		}
		System.out.println("=============================================");
		System.out.println("총점:\t" +" "+ k + "\t" + m + "\t" + e + "\t" + totalsum);

	}
}
