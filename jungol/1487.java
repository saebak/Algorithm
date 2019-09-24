package com.coding.test;

import java.util.Scanner;

public class minorityMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		for(int i=0; i<n; i++) {
			
			String mult = "";			
			int temp = 2;
			int num = scan.nextInt();
			
			while(num != 1) {
				if(num%temp == 0) {
					mult += temp;
					num = num/temp;
					if(num != 1) {
						mult += " * ";
					}
				}else if(num%temp!= 0){
					temp++;
					continue;
				}
			}
			
			System.out.println(mult);
		}
		
		
	}

}
