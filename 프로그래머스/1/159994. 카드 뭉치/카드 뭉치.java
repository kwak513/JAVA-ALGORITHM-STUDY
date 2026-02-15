import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        
        // cards1, cards2, goal -> Queue로 변경
        Queue<String> cards1Queue = new ArrayDeque<>();
        Queue<String> cards2Queue = new ArrayDeque<>();
        Queue<String> goalQueue = new ArrayDeque<>();
        
        boolean isValid = true;
        
        for(String card1: cards1){
            cards1Queue.add(card1);
        }
        for(String card2: cards2){
            cards2Queue.add(card2);
        }
        for(String g: goal){
            goalQueue.add(g);
        }
        
        
        while(!goalQueue.isEmpty()){
            if(!cards1Queue.isEmpty() && cards1Queue.peek().equals(goalQueue.peek())){
                isValid = true;
                goalQueue.poll();
                cards1Queue.poll();
            }
            else if(!cards2Queue.isEmpty() && cards2Queue.peek().equals(goalQueue.peek())){
                isValid = true;
                goalQueue.poll();
                cards2Queue.poll();
            }
            else{
                isValid = false;
                break;
            }
        }
        
        return isValid ? "Yes" : "No";
    }
}