package com.coding.test;

public class WhereIsKim {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] seoul = {"Jane", "Kim", "Park", "Lee", "Sam"};
		int num = 0;
		
		for(int i=0; i<seoul.length; i++) {
			
			if(seoul[i].equals("Kim")) {
				num = i;
				break;
			}	
		}
		
		System.out.println("김서방은 " + num + "에 있다");
	}

}
