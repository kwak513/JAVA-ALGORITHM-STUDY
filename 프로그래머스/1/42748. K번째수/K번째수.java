import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        
        
        int[] answer = new int[commands.length];
        
        for(int p = 0; p < commands.length; p++){
            // index 기준 (-1)
            int iToIdx = commands[p][0] - 1;
            int jToIdx = commands[p][1];
            int kToIdx = commands[p][2] - 1;
            
            // array 복사본
            List<Integer> copyOfArray = new ArrayList<>();

            for(int q = 0; q < array.length; q++){
                copyOfArray.add(array[q]);
            }
            
            
            List<Integer> cutArray = copyOfArray.subList(iToIdx, jToIdx);
            
            Collections.sort(cutArray);
            
            
            answer[p] = cutArray.get(kToIdx);
            
            
        }
        
        return answer;
    }
}