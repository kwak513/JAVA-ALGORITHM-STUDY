import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        
        // 정답 담을 리스트
        ArrayList<Integer> answer = new ArrayList<>();
        
        // commands 순회하면서 조건 (i, j, k) 추출
        for(int a = 0; a < commands.length; a++){
            int i = commands[a][0] - 1;
            int j = commands[a][1];
            int k = commands[a][2] - 1;
            
            // 주어진 array 복사용
            ArrayList<Integer> quesArray1 = new ArrayList<>();
            
            for(int p = 0; p < array.length; p++){
                quesArray1.add(array[p]);
            }
            
            // array 자르기
            ArrayList<Integer> quesArray = new ArrayList<>(quesArray1.subList(i, j));
            
            // array 정렬
            Collections.sort(quesArray);
            
            // k번째 값 추출
            int returnInt = quesArray.get(k);
            
            answer.add(returnInt);
        }
        
        // int[] -> ArrayList로 변환
        int answerSize = answer.size();
        int[] answerFinal = new int[answerSize];
        
        for(int q = 0; q < answer.size(); q++){
            answerFinal[q] = answer.get(q);
        }
        
        return answerFinal;
    }
}

/*
1. subList(i, j): 인덱스 i부터 j-1까지 자르기
    - 반환 타입이 List<>이기에 변환 필요
2. 문제 조건의 '번째'와 인덱스 구분 필요
*/