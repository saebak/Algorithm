package com.coding.test;

public class NOgoal {
	public static void main(String[] args) {
		
		String[] participant = {"marina", "josipa", "nikola", "vinko", "filipa"};
		String[] completion = {"josipa", "filipa", "marina", "nikola"};
		
		goal(participant, completion);
	}
	
	public static void goal(String[] participant, String[] completion) {
		
		for(int i=0; i<participant.length; i++) {
			
			String find = " ";
			
			for(int j=0; j<completion.length; j++) {
				if(completion[j] == participant[i]) {
					find = "goal";
					break;
				}else if(completion[j] != participant[i]) {
					find = participant[i];
				}
			}
			
			if(find != "goal") {
				System.out.println(find);
				break;
			}
		} 
	}
}
