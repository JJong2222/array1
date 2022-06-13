package org.java.loop;

public class ForEx1 {
	public static void main(String[] args) {
		System.out.println("for문");

		for (int i = 0; i < 10; i++) {
			// System.out.print(i+1);
//			if(i==9) {
//				System.out.print((i+1));
//			} else {
//				System.out.print((i+1)+",");
//			}
			if (i == 9) {
				System.out.print((i + 1));
				break;
			} else {
				System.out.print((i + 1) + ",");
			} //break문 맨뒤 콤마제거
		}
		for (int i=0; i<10; i++) {
			String url="";
			System.out.println("url/img/bg"+i+".jpg) no-rpeat 50%/cover");
		}

	}
}
