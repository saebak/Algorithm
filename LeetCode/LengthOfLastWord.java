class Solution {
    public int lengthOfLastWord(String s) {
         String[] str = s.split(" ");
 
         if(str.length <= 0){
             return 0;
         }
        
         int leng = str[str.length-1].length();
        
         return leng;
        
    }
}
