import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        Map<String, Integer> answerMap = new HashMap<>();
        
        // [1. clothes -> Map으로 변환] 
        // ex) {headgear: 2, eyewear: 1, face: 1}
        for(int i = 0; i < clothes.length; i++){
            String currentCategory = clothes[i][1];
            
            
            Integer categoryCount = answerMap.getOrDefault(currentCategory, 0);
            
            answerMap.put(currentCategory, categoryCount + 1);  
        }
        
        // [2. 정답 구하기]
        int answer = 1;
        
        for(Integer count: answerMap.values()){
            answer = answer * (count + 1);
        }
        
        return answer - 1;
        
    }
}


/*
[조건]
clothes:
[
    ["yellow_hat", "headgear"],
    ["green_turban", "headgear"],
    
    ["blue_sunglasses", "eyewear"],
    
    ["crow_mask", "face"]
]

=> headgear: 2개, eyewear: 1개, face: 1개

[생각]
1. headgear: 착용 X or yellow_hat or green_turban -> 3개
2. eyewear: 착용 X or blue_sunglasses -> 2개
3. crow_mask: 착용 X or crow_mask -> 2개

=> 3 * 2 * 2 - 1 (셋 다 착용 X는 불가능) = 11개

[구현]
- {headgear: 2, eyewear: 1, face: 1} -> Map
- getDefaultOr(a, b)


*/