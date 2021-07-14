class Solution {
    public int singleNumber(int[] nums) {
        
        int num = 0;
        
        for(int i=0; i<nums.length; i++){
            
            boolean same = true;
            num = nums[i];
            
            for(int j=0; j<nums.length; j++){
                
                if(i == j){
                    continue;
                }
                if(num == nums[j]){
                    same = true;
                    break;
                }else{
                    same = false;
                }
            }
            
            if(same == false){
                break;
            }
            
        }
        
        return num;
    }
}
