import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        
        // 세로 단위의 스택으로 수정 (배열 안에 스택)
        Deque<Integer>[] newArray = new ArrayDeque[board.length];
        
        for(int i = 0; i < board.length; i++){
            newArray[i] = new ArrayDeque<>();
        }
        
        for(int j = board.length - 1; j >= 0; j--){
            for(int q = 0; q < board[0].length; q++){
                if(board[j][q] != 0){
                    newArray[q].push(board[j][q]);
                }
                
            }
        }
        
        // 집게로 뽑은 결과 스택
        Deque<Integer> answerStack = new ArrayDeque<>();
        int count = 0;
        
        for(int move: moves){
            int idx = move - 1;
            
            if(newArray[idx].isEmpty()){
                continue;
            }
                
            int popItem = newArray[idx].pop();
            
            if(!answerStack.isEmpty() && answerStack.peek() == popItem){
                answerStack.pop();
                count += 2;
            }
            
            else{
                answerStack.push(popItem);
            }

        }
        
        return count;
        
    }
}