import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < clothes.length; i++){
            String name = clothes[i][0];
            String type = clothes[i][1];
            
            int currentVal = map.getOrDefault(type, 0);
            
            map.put(type, currentVal + 1);
        }
        
        int answer = 1;
        
        for(String key: map.keySet()){
            
            int val = map.get(key);
            answer *= (val + 1);
        }
        
        return answer - 1;
    }
}