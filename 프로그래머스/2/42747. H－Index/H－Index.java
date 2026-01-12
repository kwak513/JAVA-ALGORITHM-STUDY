import java.util.*;

class Solution {
    public int solution(int[] citations) {
        
        // int[] -> ArrayList<Integer>
        List<Integer> list = new ArrayList<>();
                
        for(int i = 0; i < citations.length; i++){
            list.add(citations[i]);
        }
        
        // 내림차순 정렬
        Collections.sort(list, Collections.reverseOrder());

        for(int j = list.get(0); j >= 0; j--){
            int count = 0;
            for(int p = 0; p < list.size(); p++){
                if(j <= list.get(p)){
                    count++;
                }
            }
            
            // j는 6, 5, 4, ... 
            // count는 j 이상 개수
            if(count >= j){
                return j;
            }
        }
        
        return -1;
    }
}

/*
[8, 6, 3, 1]
- 인용 횟수
    - 8회 이상: 1개
    - 7회 이상: 1개
    - 6회 이상: 2개
    - 5회 이상: 2개
    - 4회 이상: 2개
    - 3회 이상: 3개 => return 3
    - 2회 이상: 3개
    
[6, 5, 1, 0]
- 인용 횟수
    - 6회 이상: 1개
    - 5회 이상: 2개
    - 4회 이상: 2개
    - 3회 이상: 2개
    - 2회 이상: 2개 => return 2
    
[1, 1, 1]
- 인용 횟수
    - 1회 이상: 3개 => return 1
*/