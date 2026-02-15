import java.util.*;

class Solution {
    
    // 상하좌우
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    
    public int solution(int[][] maps) {
        int w =  maps[0].length;    // 가로
        int h = maps.length;    // 세로
        
        boolean[][] visited = new boolean[h][w];
        Queue<int[]> queue = new ArrayDeque<>();
        
        queue.add(new int[]{0, 0, 1});
        visited[0][0] = true;
        
        while(!queue.isEmpty()){
            int[] polledItem = queue.poll();
            
            int x = polledItem[0];
            int y = polledItem[1];
            int dist = polledItem[2];
            
            if(x == w - 1 && y == h - 1){
                return dist;
            }
            
            for(int i = 0; i < 4; i++){
                int newX = x + dx[i];
                int newY = y + dy[i];
                
                if(newX < 0 || newY < 0 || newX >= w || newY >= h){
                    continue;
                }
                if(maps[newY][newX] == 0 || visited[newY][newX]){
                    continue;
                }
                
                visited[newY][newX] = true;
                queue.add(new int[]{newX, newY, dist + 1});
                
            }
        }
        
        return -1;
    }
}