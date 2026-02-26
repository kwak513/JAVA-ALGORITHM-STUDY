import java.util.*;

class Solution {
    public int solution(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int num: nums){
            int currentVal = map.getOrDefault(num, 0);
            
            map.put(num, currentVal);
        }
        
        int numToSelect = nums.length / 2;
        int mapLength = map.keySet().size();
        
        if(numToSelect >= mapLength){
            return mapLength;
        }
        else{
            return numToSelect;
        }
        
        
        
    }
}