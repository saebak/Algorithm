package com.coding.test;

public class bowlHeight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(bowl("()()()))("));
		
	}
	
	public static int bowl(String s) {
		
		int height = 0;	//최종 높이
			
			if(s.charAt(0)=='(' ||s.charAt(0)==')') {	//단어가 ( 나 )이면 그릇높이 계산
				height +=10;	//첫 그릇높이는 무조건 + 10
				for(int i=1; i<s.length(); i++) {	//다음그릇부터
					if(s.charAt(i) == s.charAt(i-1)) {	//전그릇과 똑같은 모양이라면
						height += 5;	//+5
					}else{
						height += 10;	//전 그릇과 다른모양이라면 +10
					}
				}
			}
		
		return height;
		
	}

}

