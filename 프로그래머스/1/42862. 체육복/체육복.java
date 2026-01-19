import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        
        
        // lost, reserve 중복 학생 지우기 위해서 Set 생성
        Set<Integer> lostSet = new HashSet<>();
        Set<Integer> reserveSet = new HashSet<>();
        
        for(int i: lost){
            lostSet.add(i);
        }
        for(int j: reserve){
            reserveSet.add(j);
        }
        
        // lost, reserve 모두에 있는 학생 지우기
        Set<Integer> tempSet = new HashSet<>(lostSet);
        
        for(int t: tempSet){
            if(reserveSet.contains(t)){
                lostSet.remove(t);
                reserveSet.remove(t);
            }
        }
        
        List<Integer> reserveList = new ArrayList<>(reserveSet);
        Collections.sort(reserveList);
        
        for(int p: reserveList){
            if(lostSet.contains(p - 1)){
                lostSet.remove(p - 1);
            }
            else if(lostSet.contains(p + 1)){
                lostSet.remove(p + 1);
            }
        }
        
        return n - lostSet.size();
    }
}

