import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        
        
        for(int i = 1; i <= yellow; i++){
            if(yellow % i == 0){
                int j = yellow / i;
                
                if((i + 2) * (j + 2) - (i * j) == brown){
                    int garo = Math.max(i + 2, j + 2);
                    int sero = Math.min(i + 2, j + 2);
                    
                    return new int[]{garo, sero};
                }
                
            }
        }
        
        return new int[1];
        
    }
}


/*
가로 >= 세로

- 노란색 사각형의 가로 a, 세로 b
- 갈색 사각형의 가로 (a + 2), 세로 (b + 2)

- 노란색 개수 24
    - 1*24
    - 2*12
    - 3*8
    - 4*6




*/