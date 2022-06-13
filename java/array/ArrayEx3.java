package org.java.array;

public class ArrayEx3 {
	public static void main(String[] args) {

		char[] ch = { 'C', 'A', 'F', 'E' };

		String s1 = new String(ch); // char배열 --> String변환
		System.out.println(s1);
		System.out.println(s1.equals("CAFE"));

		String[] binnery = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1110", "1100", "1101", "1110", "1111", };

		String result = "";
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] >= '0' && ch[i] <= '0') {
				result += binnery[ch[i] - '0'];
			} else {
				result += binnery[ch[i] - 'A' + 10];
			}
		}
		System.out.println("ch=" + new String(ch));
		System.out.println("ch=" + String.copyValueOf(ch));
		System.out.println(result);
	}
}
