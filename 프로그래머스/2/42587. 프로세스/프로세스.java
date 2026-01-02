import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<Process> queue = new LinkedList<>();
        
        // [(0, 2), (1, 1), (2, 3), (3, 2)]
        for(int i = 0; i < priorities.length; i++){
            queue.add(new Process(i, priorities[i]));
        }
        
        int count = 0;  // poll 횟수 (프로세스 실행 순서)
        
        
        while(!queue.isEmpty()){
            Process current = queue.poll();     // (0, 2)
            boolean hasBigger = false;
            
            for(Process p: queue){
                if(current.priority < p.priority){
                    hasBigger = true;
                    break;
                }
            }
            
            // 현재보다 더 중요한 게 있다면, 현재 프로세스를 큐의 뒤로 보내기
            if(hasBigger){
               queue.add(current);
            }
            // 아니라면, 
            else{
                count++;
                
                if(current.index == location){
                    return count;
                }
            }
            
            
        }
        
        return -1;
        
        
    }
}

class Process {
    int index;
    int priority;
    
    Process(int index, int priority){
        this.index = index;
        this.priority = priority;
    }
}

/*
[풀이]
ex) priorities: [2, 1, 3, 2], location: 2
1. priorities -> (index, priority) 묶어서 큐에 저장
    - (0, 2)
    - (1, 1)
    - (2, 3)
    - (3, 2)
2. 첫번째부터 poll
   큐에 남은 것들과 우선순위 비교
    - 현재 우선순위가 높으면 출력
    - 낮으면 뒤로 add

[헷갈리는 것]
1. LinkedList: Queue의 대표 구현체
2. Queue에는 한 번에 하나의 값만 넣을 수 있음. 여러개를 넣으려면 객체 이용

*/