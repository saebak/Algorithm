class Solution {
  public String solution(String phone_number) {
      String answer = "";
      int n = 4;
      for(int i=0; i<phone_number.length(); i++){
          if(i == phone_number.length()-n){
              answer += phone_number.charAt(i);
              n--;
          }else{
              answer += "*";
          }
      }
      
      return answer;
  }
}
