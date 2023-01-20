package org.practice;

public class Stringggg {

	public static void main(String[] args) {
		String s = "Performance good";
		String[] s1 = s.split(" ");
		String rev = "";
		for (int i = 0; i < s1.length; i++) {
			String s2 = s1[i];
			for (int j = s2.length() - 1; j >= 0; j--) {
				rev = rev + s2.charAt(j);
			}
		}
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				System.out.print(' ');
			} else {
				System.out.print(rev.charAt(j));
				j++;
			}
		}
	}
}
