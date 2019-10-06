package com.coding.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StrangeMult {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		//숫자 입력
		int num = scan.nextInt();
		int num2 = scan.nextInt();
		
		//입력받은 수가 몇자리수인가?
		int count = 1;
		int count2 = 1;
		
		//입력받은 숫자의 각 자리수를 구하기 위한 변수
		int mok = num;
		int mok2 = num2;
		int namuge = 0;
		int namuge2 = 0;
		
		
		//입력받은 숫자 몇자리수인지 구해서 count에 저장
		while(mok > 10) {
			mok = mok/10;
			count++;
		}
		
		while(mok2 > 10) {
			mok2 = mok2/10;
			count2++;
		}
		
		
		//각 자릿수를 저장할 배열
		int[] numArray = new int[count];   
		int[] numArray2 = new int[count2];
		
		//첫번째 숫자와 두번째 숫자의 곱을 저장할 변수
		int[] numArray3 = new int[count*count2];
		
		int i=0;
		
		
		//각 자릿수들을 배열에 저장
		while(num > 0) {		
			numArray[i] = num%10;
			num = num/10;
			i++;
		}
		
		int j = 0;
		while(num2 > 0) {
			numArray2[j] = num2%10;
			num2 = num2/10;	
			j++;
		}
		
		
		int k=0;
		
		//첫번째 숫자와 두번째 숫자 각 자릿수를 곱한값을 배열에 저장
		for(i=0; i<numArray.length; i++) {
			for(j=0; j<numArray2.length; j++) {
				numArray3[k] = numArray[i]*numArray2[j];
				k++;
			}
		}
		
		int sum =0;
		
		//각 인데스에 저장되어 있는 숫자들 더하기
		for(i=0; i<numArray3.length; i++) {
			sum += numArray3[i];
		}
		
		System.out.println(sum);
	}

}
