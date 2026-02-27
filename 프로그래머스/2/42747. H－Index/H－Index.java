class Solution {
    public int solution(int[] citations) {
        
        int maxCitation = citations[0];
        
        for(int citation: citations){
            maxCitation = Math.max(maxCitation, citation);
        }
        
        for(int i = maxCitation; i >= 0; i--){
            int count = 0;
            
            for(int cit: citations){
                if(i <= cit){
                    count++;
                }
                
            }
            
            if(i <= count){
                return i;
            }
        }
        
        return -1;
    }
}