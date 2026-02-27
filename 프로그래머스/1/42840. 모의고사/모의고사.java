import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        
        int[] pattern1 = new int[]{1, 2, 3, 4, 5};
        int[] pattern2 = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int score1 = 0;
        int score2 = 0;
        int score3 = 0;
        
        for(int i = 0; i < answers.length; i++){
            int currentAnswer = answers[i];
            
            int current1 = pattern1[i % pattern1.length];
            int current2 = pattern2[i % pattern2.length];
            int current3 = pattern3[i % pattern3.length];
            
            if(current1 == currentAnswer) score1++;
            if(current2 == currentAnswer) score2++;
            if(current3 == currentAnswer) score3++;
            
            
        }
        
        int maxScore = Math.max(Math.max(score1, score2), score3);
        List<Integer> answerList = new ArrayList<>();
        
        if(score1 == maxScore) answerList.add(1);
        if(score2 == maxScore) answerList.add(2);
        if(score3 == maxScore) answerList.add(3);
        
        int[] answer = new int[answerList.size()];
        
        for(int j = 0; j < answerList.size(); j++){
            answer[j] = answerList.get(j);
        }
        
        return answer;
    }
}