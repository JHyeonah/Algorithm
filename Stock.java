import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        Stack<Integer> stack = new Stack<Integer>();
        int[] answer = new int[prices.length]; 
        
        for(int i = 0; i < prices.length; i++){
            while(!stack.isEmpty()){
                int peek = prices[stack.peek()];
                
                if (peek > prices[i]) {
                    int pop = stack.pop();
                    answer[pop] = i - pop;
                } else {
                    break;
                }
            }
            
            stack.add(i);
        }
        
        while(!stack.isEmpty()) {
            int pop = stack.pop();
            answer[pop] = prices.length - pop - 1;
        }
        
        return answer;
    }
}
