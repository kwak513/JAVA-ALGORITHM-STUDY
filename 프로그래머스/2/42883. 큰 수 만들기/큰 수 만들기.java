import java.util.*;

class Solution {
    public String solution(String number, int k) {
        Stack<Character> stack = new Stack<>();
        int answerLength = number.length() - k;
        
        for(char c: number.toCharArray()){
            // 지우는 경우
            while(k > 0 && !stack.isEmpty() && stack.peek() < c){               
                stack.pop();
                k--;
            }
            stack.push(c);
        }
        
        StringBuilder answer = new StringBuilder();
        
        for(int i = 0; i < answerLength; i++){
            answer.append(stack.get(i));
        }
        
        return answer.toString();
        
    }
}  