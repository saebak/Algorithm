class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int targetNum = 0;
        int index = -1;
        int[] array = new int[2];
        
        for(int i=0; i<nums.length-1; i++){

            targetNum = target - nums[i];
            
            for(int j=i+1; j<nums.length; j++){
               if(targetNum == nums[j]){
                   index = j;
                   break;
               }
            }
            
            if(index > -1){
                array[0] = i;
                array[1] = index;
                break;
            }   
        }
        
        return array;
    }
}
