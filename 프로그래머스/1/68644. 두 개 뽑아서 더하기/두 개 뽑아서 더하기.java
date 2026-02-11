import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0; i < numbers.length; i++){
            for(int j = i + 1; j < numbers.length; j++){
                set.add(numbers[i] + numbers[j]);
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>(set);
        
        Collections.sort(list);
        
        int listSize = list.size();
        
        int[] answer = new int[listSize];
        
        for(int p = 0; p < listSize; p++){
            answer[p] = list.get(p);
        }
        
        return answer;
    }
}