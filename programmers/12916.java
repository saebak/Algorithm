package com.coding.test;

import java.util.Scanner;

public class StringPY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		int p = 0;
		int y = 0;
		
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
				p++;
			}else if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				y++;
			}
		}
		
		if(p == y) {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		
	}

}
