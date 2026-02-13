class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        
        for(int i = 0; i < arr1.length; i++){
            for(int j = 0; j < arr2[0].length; j++){
                for(int k = 0; k < arr1[0].length; k++){
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        
        return answer;
    }
}

/*
행렬 곱의 결과: (arr1 행) * (arr2 열)

for (i: arr1 행)
  for (j: arr2 열)
    for (k: arr1 열)
    
*/