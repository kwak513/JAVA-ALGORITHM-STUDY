import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // [ 1. int[] -> String[] ]
        String[] numbersToString = new String[numbers.length];
        
        for(int i = 0; i < numbers.length; i++){
            numbersToString[i] = String.valueOf(numbers[i]);
        }
        
        // [2. numbersToString 정렬]
        Arrays.sort(numbersToString, Collections.reverseOrder((a, b) -> (a + b).compareTo(b + a)));
        
        // [3. 숫자가 전부 0이면, 0 반환]
        if(numbersToString[0].equals("0")){
            return "0";
        }
        
        // [4. StringBuilder 이용]
        StringBuilder answer = new StringBuilder();
        
        for(int j = 0; j < numbersToString.length; j++){
            // answer = answer + numbersToString[j];
            answer.append(numbersToString[j]);
        }
               
        return answer.toString();
        
        
        
    }
}


/*
문법
1.
Arrays.sort(numbersToString, Collections.reverseOrder((a, b) -> (a + b).compareTo(b + a)));

2. 
- StringBuilder 생성
- append
- .toString()

*/