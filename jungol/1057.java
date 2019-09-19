package com.coding.test07;

import java.util.Scanner;

public class CrazySequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		int i = 0;
		int count = 0;
		String confirm = "notFind";	
		
		while (true) {
			i++;	//미친수열은 1은 1 2는 22 3은 333이렇게 표시된다. 1부터 차례대로 증가하며 수열을 시작한다.
			for (int j = 0; j < i; j++) {	//해당 숫자만큼 반복
				count++;	//n번째를 찾기위해 수열의 다음숫자로 갈때마다 count
				System.out.print(i + " ");
				if (count == n) {	//count와 n이 같다면 n번째 숫자 찾음
					confirm = "Find";
					break;
				}
			}
			
			if (confirm.equals("Find")) {
				break;
			}
		}
		
		System.out.println();
		System.out.println(i);

	}
}
