import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        
        int[] stagePeople = new int[N + 2];
        
        for(int stage: stages){
            stagePeople[stage]++;
        }
      
        List<Stage> list = new ArrayList<>();
        double totalPlayers = stages.length;
        
        for(int j = 1; j <= N; j++){
            if(totalPlayers == 0){
                list.add(new Stage(j, 0.0));
            }
            else{
                double failRate = stagePeople[j] / totalPlayers;
                list.add(new Stage(j, failRate));
                totalPlayers -= stagePeople[j];
                
            }
        }
        
        list.sort((a, b) -> {
            if(a.rate == b.rate){
                return Integer.compare(a.id, b.id);
            }
            else{
                return Double.compare(b.rate, a.rate);
            }
            
        });
            
        int[] answer = new int[N];
        for(int p = 0; p < N; p++){
            answer[p] = list.get(p).id;
        }
        
        return answer;
        
    }
    
    class Stage{
        int id;
        double rate;
        
        Stage(int id, double rate){
            this.id = id;
            this.rate = rate;
        }
    }
}