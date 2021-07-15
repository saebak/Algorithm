class Solution {
    
    private int top;    //스택 포인터
    private int stackSize;  //스택 사이즈
    private char stackArr[];    //스택 쌓는 배열
    
    public boolean isValid(String s) {
        
        top = -1;
        stackSize = s.length();;
        stackArr = new char[stackSize];
        
        for(int i=0; i<stackSize; i++){
            
            if(s.charAt(i) == ')'){
                if(peek() == '('){
                    pop();
                }else{
                    push(s.charAt(i));
                }
            }else if(s.charAt(i) == '}'){
                if(peek() == '{'){
                    pop();
                }else{
                    push(s.charAt(i));
                }
            }else if(s.charAt(i) == ']'){
                if(peek() == '['){
                    pop();
                }else{
                    push(s.charAt(i));
                }
            }else{
                push(s.charAt(i));
            }
        }
        
        if(top == -1){
           return true;
        }else{
           return false;
        }
    }


    public boolean isEmpty(){
        return (top == -1);
    }
    
    public boolean isFull(){
        return (top == stackSize-1);
    }
    
    public void push(char item){
        if(isFull()){
            System.out.println("stack is full");
        }else{
            stackArr[++top] = item;
        }
    }
    
    public char pop(){
        if(isEmpty()){
           return 0;
        }else{
            return stackArr[top--];
        }
    }
    
    public char peek(){
        if(isEmpty()){
            return 0;
        }else{
            return stackArr[top];
        }
    }
    
}
