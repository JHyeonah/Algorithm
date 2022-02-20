import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        int answer = 0;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        int aIndex = 0;
        int bIndex = 0;
        
        for (int i = 0; i < A.length; i++) {
            if (A[aIndex] < B[bIndex]) {
                answer++;
                aIndex++;
                bIndex++;
            } else {
                bIndex++;
            }
        }   
            
        return answer;
    }  
}
