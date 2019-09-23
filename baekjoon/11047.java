package com.coding.test;

import java.util.Scanner;

public class CoinQuantity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int k = scan.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			a[i] = scan.nextInt();
		}
		
		int count = 0;
		
		//가장 나중에 입력한 동전단위가 가장 크기때문에 배열의 마지막인덱스부터 시작
		for(int i=n-1; i>=0; i--) {
			if(a[i] > k) {	//동전단위가 k보다 크면 돈이 초과되므로 넘긴다
				continue;
			}else if(a[i] <= k) {	//동전단위가 k와 같거나 작다면
				count += k/a[i];	//나누어 개수를 구하고
				k = k%a[i];	//나머지로 다시 계산한다
			}
			
			if(k == 0) {	//k가 0이면 더이상 동전이 필요 없기때문에 반복을 그만둔다
				break;
			}
		}
		
		System.out.println(count);
	}

}
