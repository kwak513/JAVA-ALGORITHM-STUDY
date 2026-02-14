import java.util.*;

class Solution {
    public int solution(String s) {
        
        
        int xLimit = s.length();
        String gualho;
        
        int count = 0;
        boolean isValid = true;
        
        
        
        for(int i = 0; i < xLimit - 1; i++){
            gualho = s.substring(i, xLimit) + s.substring(0, i);
            Deque<Character> stack = new ArrayDeque<>();
            isValid = true;
            
            for(char c: gualho.toCharArray()){
                if(c == '(' || c == '{' || c == '['){
                    stack.push(c);
                }
                else{
                    if(stack.isEmpty()){
                        isValid = false;
                        break;
                    }
                    
                    char top = stack.peek();
                    
                    if(c == ')' && top  == '('){
                        stack.pop();
                    }
                    else if(c == '}' && top  == '{'){
                        stack.pop();
                    }
                    else if(c == ']' && top  == '['){
                        stack.pop();
                    }
                    else{
                        isValid = false;
                    }
                }
            }
            
            
            if(isValid && stack.isEmpty()){
                count++;
            }
            
        }
        
        return count;
    }
}