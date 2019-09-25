package com.coding.test;

public class bowlHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(bowl("()()()))("));
		
	}
	
	public static int bowl(String s) {
		
		int height = 0;
			
			if(s.charAt(0)=='(' ||s.charAt(0)==')') {
				height +=10;
				for(int i=1; i<s.length(); i++) {
					if(s.charAt(i) == s.charAt(i-1)) {
						height += 5;
					}else{
						height += 10;
					}
				}
			}
		
		return height;
		
	}

}
