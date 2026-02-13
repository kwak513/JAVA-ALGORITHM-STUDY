import java.util.*;

class Solution {
    public int solution(String dirs) {
        Set<String> pathSet = new HashSet<>();
        
        int x = 5;
        int y = 5;
        
        for(char dir: dirs.toCharArray()){
            int nx = x;
            int ny = y;
            
            if(dir == 'U'){
                ny++;
            }
            else if(dir == 'D'){
                ny--;
            }
            else if(dir == 'R'){
                nx++;
            }
            else if(dir == 'L'){
                nx--;
            }
            
            if(nx < 0 || nx > 10 || ny < 0 || ny > 10){
                continue;
            }
            
            String route1 = x + "" + y + "" + nx + "" + ny;
            String route2 = nx + "" + ny + "" + x + "" + y;
            
            pathSet.add(route1);
            pathSet.add(route2);
            
            x = nx;
            y = ny;
        }
        
        return pathSet.size() / 2;
    }
}