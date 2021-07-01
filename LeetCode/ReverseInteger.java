class Solution {
    public int reverse(int x) {
        
        int result = 0;
        StringBuffer sb = new StringBuffer(x + "");
        
        try{
            if(x < 0){
                sb = sb.replace(0,1, "");
                result = Integer.parseInt("-" + sb.reverse().toString());
            }else{
                result = Integer.parseInt(sb.reverse().toString());
            }
        }catch (NumberFormatException e){
            
        }catch(Exception e){
            
        }
        
        return result;
    }
}
