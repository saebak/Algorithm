class Solution {
  public String solution(String s) {
      String answer = "";
      int temp = 0;
      for(int i=0; i<s.length(); i++){
          if(temp%2 != 0){
              answer += Character.toLowerCase(s.charAt(i));
          }else{
              answer += Character.toUpperCase(s.charAt(i));
          }
          temp++;
          
          if(s.charAt(i) == ' '){
              temp = 0;
          }
      }
      
      return answer;
  }
}
