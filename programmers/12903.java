package com.coding.test;

import java.util.Scanner;

public class CenterCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		
		if(s.length()%2 == 0) {
			System.out.println(s.charAt(s.length()/2-1) + "" +s.charAt(s.length()/2));
		}else {
			System.out.println(s.charAt(s.length()/2));
		}
		
	}

}
