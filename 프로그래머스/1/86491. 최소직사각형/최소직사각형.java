import java.util.*;

/*
- 명함의 긴 변을 '가로'로, 짧은 변을 '세로'로 통일
*/

class Solution {
    public int solution(int[][] sizes) {
        
        // 긴 변 (가로) 담을 리스트
        ArrayList<Integer> garo = new ArrayList<>();
        // 짧은 변 (세로) 담을 리스트
        ArrayList<Integer> sero = new ArrayList<>();
        
        
        for(int i = 0; i < sizes.length; i++){
            // 첫번째 숫자
            int firstNum = sizes[i][0];
            // 두번째 숫자
            int secondNum = sizes[i][1];
            
            // 더 큰 숫자를 garo에 넣음
            if(firstNum > secondNum){
                garo.add(firstNum);
                sero.add(secondNum);
            }
            
            else{
                garo.add(secondNum);
                sero.add(firstNum);
            }
        }
        
        // 정렬
        Collections.sort(garo);
        Collections.sort(sero);
            
        // 마지막 인덱스 추출    
        int garoLength = garo.size();
        int seroLength = sero.size();
        
        int finalGaro = garo.get(garoLength - 1);
        int finalSero = sero.get(seroLength - 1);
        
        return finalGaro * finalSero;
        
    }
}