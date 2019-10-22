package com.coding.test09;

import java.util.Scanner;

public class stockPrice {

	public static void main(String[] args) {
		
		int[] stock = {1,2,3,2,3};
		
		stockPrice(stock);
		
	}
	
	//주식가격 함수
	public static void stockPrice(int[] stock) {
		
		int leng = stock.length;	//배열의 길이
		
		int[] second = new int[leng];
		
		for(int i=0; i<leng; i++) { //1초 시점부터 끝시점까지 반복
			
			int count = 0;
			
			for(int j=i+1; j<leng; j++) {	//i초와 그 다음초부터 가격비교
				if(stock[i] <= stock[j]) {	//가격이 떨어지지 않았따면 다음으로
					count++;
				}else if(stock[i] > stock[j]){
					count++;	//가격이 떨어졌다면 1초를 더한뒤 break
					break;
				}
			}
			
			if(i==leng) {	//마지막 초라면 무조건 0초
				count=0;
			}
			
			second[i] = count;
			
		}
		
		for(int i=0; i<second.length; i++) {
			System.out.print(second[i] + " ");
		}
	} 
}
