package com.coding.test;

import java.util.Scanner;

public class EnglishSort {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int num  = scan.nextInt(); //단어의 갯수를 입력
			
		String[] voca = new String[num];
		
		for(int i=0; i<num; i++) {
			voca[i] = scan.next();  //단어 입력
		}
		
		String temp = null;
		
		
		//글자 길이대로 정렬
		for(int i=0; i<num; i++) {
			for(int j=i; j<num; j++) {
				if(voca[i].length() > voca[j].length()) {
					temp = voca[i];
					voca[i] = voca[j];
					voca[j] = temp;
				//글자 길이가 똑같을 경우 알파벳 순서대로 나열	
				}else if(voca[i].length() == voca[j].length()) {
					
				}
			}
		}
		
		//중복없애주는 식
		for(int i=0; i<num; i++) {
			
			int j=i+1;
			
			if(j>=num) {
				j=i;
			}
			
			if(voca[i].equals(voca[j])){
				System.out.println(voca[i]);
				i++;
			}else {
				System.out.println(voca[i]);
			}
		}
	}
}
