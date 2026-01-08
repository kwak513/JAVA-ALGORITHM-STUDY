import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        
        int count = 0;
        // 오름차순 
        Queue<Integer> scovilleQueue = new PriorityQueue<>();
        
        for(int i: scoville){
            scovilleQueue.add(i);
        }
        
       
        
        int firstSmallK;
        int secSmallK;
        
        while(scovilleQueue.peek() < K){
            
            if(scovilleQueue.size() < 2){
                return -1;
            }
            
            
            count++;
            firstSmallK = scovilleQueue.poll();
            secSmallK = scovilleQueue.poll();
            
            int newK = firstSmallK + (secSmallK * 2);
            scovilleQueue.add(newK);
            
        }
        
         if(scovilleQueue.peek() >= K){
            return count;
        }
        else{
            return -1;
        }
        
        
    }
}