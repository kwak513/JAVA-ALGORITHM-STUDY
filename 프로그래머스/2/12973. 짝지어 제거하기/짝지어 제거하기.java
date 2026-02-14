import java.util.*;

class Solution{
    public int solution(String s){
        // 문자열을 담을 스택
        Deque<Character> stack = new ArrayDeque<>();
        
        for(char c: s.toCharArray()){
            
            if(stack.isEmpty() || stack.peek() != c){
                stack.push(c);
            }
            // if(){
            //     stack.push(c);
            // }
            else if(stack.peek() == c){
                stack.pop();
            }
        }
        
        if(stack.isEmpty()){
            return 1;
        }
        else{
            return 0;
        }
        
    }
}