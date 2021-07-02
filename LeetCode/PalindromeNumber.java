class Solution {
    public boolean isPalindrome(int x) {
        
        String num = x + "";
        StringBuffer sb = new StringBuffer(num);
        
        if(x < 0){
            return false;
        }else{    
            if(num.equals(sb.reverse().toString())){
                return true;
            }else{
                return false;
            }
            
        }
    }
}
