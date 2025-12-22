import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        
        HashMap<String, Integer> marathonMap = new HashMap<>();
        
        for(int i = 0; i < participant.length; i++){
            int defaultValue = marathonMap.getOrDefault(participant[i], 0);
            
            marathonMap.put(participant[i], defaultValue + 1);
        }
        
        for(int j = 0; j < completion.length; j++){
            int defaultValue2 = marathonMap.getOrDefault(completion[j], 0);
            
            marathonMap.put(completion[j], defaultValue2 - 1);
        }
        
        for(String name: marathonMap.keySet()){
            if(marathonMap.get(name) != 0){
                return name;
            }
        }
        
        
    
        
        return "";
    }
}