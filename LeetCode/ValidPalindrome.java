class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuffer str = new StringBuffer();
        int askii = 0;
        s = s.toLowerCase();
        
        for(int i=0; i<s.length(); i++){
            askii = (int)s.charAt(i);
            if((askii >= 65 && askii <= 90)){           //알파벳 대문자
                str.append(s.charAt(i));
            }else if((askii >= 97 && askii <= 122)){    //알파벳 소문자
                str.append(s.charAt(i));
            }else if((askii >= 48 && askii <= 57)){     //숫자
                str.append(s.charAt(i));
            }else{
                continue;
            }
        }
        
        System.out.println(str.toString());
        
        if(str.toString().equals(str.reverse().toString())){
            return true;
        }else{
            return false;
        }
    }
}
