class Solution {
    public String longestCommonPrefix(String[] strs) {
        
        StringBuffer pre = new StringBuffer(""); 
        String st = "";
        Boolean b = true;
        
        try{    
            for(int i=0; i<strs[0].length(); i++){

                st = strs[0].charAt(i) + "";

                for(int j=1; j<strs.length; j++){

                    if(st.equals(strs[j].charAt(i) + "")){
                        b = true;
                    }else{
                        b = false;
                        break;
                    }
                }

                if(b == true){
                    pre.append(st);    
                }else{
                    break;
                }

            }
        }catch(Exception e){
            
        }
        
        return pre.toString();
        
    }
}
