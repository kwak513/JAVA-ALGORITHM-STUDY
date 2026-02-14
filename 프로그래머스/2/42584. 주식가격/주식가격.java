import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        
        // 인덱스 넣을 스택
        Deque<Integer> stack = new ArrayDeque<>();
        
        // 정답 담을 배열
        int[] answer = new int[prices.length];
        
            
        for(int i = 0; i < prices.length; i++){
            
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                    answer[stack.peek()] = i - stack.peek();
                    stack.pop();
                }
                
            stack.push(i);
            
        }
        
        while(!stack.isEmpty()){
            int idx = stack.pop();
            answer[idx] = prices.length - 1 - idx;
            
        }
        
        
        return answer;
        
    }
}