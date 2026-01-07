import java.util.*;
class Solution {
    public int[] solution(int[] prices) {
        
        int priceLength = prices.length;
        
        Stack<Integer> stack = new Stack<>();
        
        int[] answer = new int[priceLength];
        
        for(int i = 0; i < priceLength; i++){
            while(!stack.isEmpty() && prices[i] < prices[stack.peek()]){
                int j = stack.pop();
                
                answer[j] = i - j;
                
            }
            
            stack.push(i);
            
        }
        
        while(!stack.isEmpty()){
            int p = stack.pop();
            answer[p] = (priceLength - 1) - p;
        }
        
        return answer;
        
        
    }
}

/*

[1, 2, 3, *2*, 3]
- 떨어진 지점이 변곡점
[1, 2, 3, *2*] 
[-, -, 1, -]


- index 저장
- 새로운 게 들어오면, 전의 값들과 비교

*/