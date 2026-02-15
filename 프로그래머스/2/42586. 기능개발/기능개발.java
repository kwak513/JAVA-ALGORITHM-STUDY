import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        
        // 작업 시간 저장할 큐
        Queue<Integer> timeQueue = new ArrayDeque<>();
        
        // 작업 시간을 큐에 저장
        for(int i = 0; i < progresses.length; i++){
            int time = (100 - progresses[i]) % speeds[i] != 0 ? (100 - progresses[i]) / speeds[i] + 1 : (100 - progresses[i]) / speeds[i];
            timeQueue.add(time);
            
        }
        
        List<Integer> answerList = new ArrayList<>();
        
        // poll 하면서 대소 비교
        while(!timeQueue.isEmpty()){
            
            // return 할 count
            int count = 0;
            // poll한 값
            int polledInt = timeQueue.poll();
            count++;
            
            
            // poll >= peek -> poll후, count++
            // 함께 나갈 것들 '전부' 꺼내기
            while(!timeQueue.isEmpty() && polledInt >= timeQueue.peek()){
                timeQueue.poll();
                count++;
            }
            
            answerList.add(count);
        }
        
        // answerList -> int[]
        
        int[] answer = new int[answerList.size()];
        
        for(int p = 0; p < answerList.size(); p++){
            answer[p] = answerList.get(p);
        
        }
        
        return answer;
        
    }
}