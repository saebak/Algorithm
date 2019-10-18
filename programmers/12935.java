import java.util.ArrayList;
import java.util.Arrays;
class Solution {
  public int[] solution(int[] arr) {
      
      int[] temp = new int[arr.length];
      
      for(int i=0; i<arr.length; i++){
			temp[i] = arr[i];
		}
		
	  Arrays.sort(temp);
      
      ArrayList<Integer> list = new ArrayList<>();
      
      for(int i:arr){
          if(arr.length == 1){
              list.add(-1);
          }else if(i != temp[0]){
			list.add(i);
		   }
      }
      
      int[] answer = new int[list.size()];
      
      for(int i=0; i<list.size(); i++){
         answer[i] = list.get(i);        
      }
      
      return answer;
  }
}  
