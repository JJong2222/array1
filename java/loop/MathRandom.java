package org.java.loop;

public class MathRandom {
	public static void main(String[] args) {
		System.out.println("Math.random(난수) 0<= math.random()<1");
		
		// 랜덤한 double형 data가 출력
		System.out.println(Math.random()); //double
		
		// 0<=Math.random()<1
		
		// 0*10<= Math.random()*10 <1*10 (0<= <10)
		
		double rad=Math.random()*10;
		// System.out.println("난수(0이상10미만)\n"+
		// 4Math.random()*10+"\nint형: "+(int)(Math.random()*10)); //실행할 때마다 나옴
		System.out.println("난수(0이상10미만)\n"+rad+"\nint형:"+(int)rad);
		
		for(int i=0; i<10; i++) {
			double rad2=Math.random()*10;
			System.out.print((int)rad2+"");
		}
	
	}
}
