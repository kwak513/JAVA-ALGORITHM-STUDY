import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        for(int i: lost){
            lostSet.add(i);
        }
        for(int j: reserve){
            reserveSet.add(j);
        }
        // 1. 중복 제거
        Set<Integer> tempSet = new HashSet<>(reserveSet);
        for(Integer p: tempSet){
            if(lostSet.contains(p)){
                lostSet.remove(p);
                reserveSet.remove(p);
            }
        }
        
        // 2. List로 만들어서 정렬
        // List<Integer> lostList = new ArrayList<>(lostSet);
        List<Integer> reserveList = new ArrayList<>(reserveSet);
        
        // Collections.sort(lostList);
        Collections.sort(reserveList);
        
        // 3. 
        
        for(Integer q: reserveList){
            if(lostSet.contains(q - 1)){
                lostSet.remove(q - 1);
                reserveSet.remove(q);
            }
            else if(lostSet.contains(q + 1)){
                lostSet.remove(q + 1);
                reserveSet.remove(q);
            }
        }
        
        return n - lostSet.size();
        
    }
}



// 1. lost, reserve 모두에 있는 학생 lost에서 제외
// 2. reservce 학생 기준으로 앞 -> 뒤 순서로 빌려주기

// -> return n - lost 수

// ArrayList vs Set
// - ArrayList
//     - contains(3): 값 3 있나?
//     - remove(3): 인덱스 3 삭제
// - Set
//     - contains(3): 값 3 있나?
//     - remove(3): 값 3 삭제
    
// - ArrayList의 remove
//     - remove(int index): 인덱스 삭제 -> remove(3)
//     - remove(Object o): 값 삭제    -> remove(Integer.valueOf(3))