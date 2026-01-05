import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        
        // [1. phone_book 정렬]
        Arrays.sort(phone_book);
        
        // [2. 직전 값과 비교]
        for(int i = 0; i < phone_book.length - 1; i++){
            
            if(phone_book[i + 1].startsWith(phone_book[i])){
                return false;                
            }
        }
        
        return true;
    }
}


/*
[풀이]
- phone_book: 전화번호 목록
- 결과: 12, 123, 34, 345
- 12와 123 비교, 123과 34 비교 .. -> 앞의 것과 비교해서, 겹치는지 확인

[사고 과정]
1. "phone_book의 길이는 1 이상 1,000,000 이하입니다": '이중 for문은 안되겠다.'
2. ["9", "91", "119", "12", "123", "2"] 문자열 정렬: 119, 12, 123, 2, 9, 91
    - 원리: 첫 글자 비교 -> 같으면 두번째 글자 비교 -> ...
    - 결과: 같은 접두사를 가진 요소들은 반드시 인접한다.

*/