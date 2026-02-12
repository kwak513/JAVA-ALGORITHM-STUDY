import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        int answerLength = answers.length;
        
        int[] pattern1 = {1, 2, 3, 4, 5};
        int[] pattern2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] pattern3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] answer1 = new int[answerLength];
        int[] answer2 = new int[answerLength];
        int[] answer3 = new int[answerLength];
            
            
        for(int i = 0; i < answerLength; i++){
            answer1[i] = pattern1[i % 5];
            answer2[i] = pattern2[i % 8];
            answer3[i] = pattern3[i % 10];
        }
        
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        
        for(int j = 0; j < answerLength; j++){
            if(answers[j] == answer1[j]){
                count1++;
            }
            if(answers[j] == answer2[j]){
                count2++;
            }
            if(answers[j] == answer3[j]){
                count3++;
            }
        }
        
        List<Integer> returnPeople = new ArrayList<>();
        
        int max = Math.max(Math.max(count1, count2), count3);
        
        if(max == count1){
            returnPeople.add(1);
        }
        if(max == count2){
            returnPeople.add(2);
        }
        if(max == count3){
            returnPeople.add(3);
        }
        
        int[] returnAnswer = new int[returnPeople.size()];
        
        for(int a = 0; a < returnPeople.size(); a++){
            returnAnswer[a] = returnPeople.get(a);
        }
        
        return returnAnswer;
    }
}