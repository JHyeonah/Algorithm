import java.util.*;

class CompareNumberAsString {
    public String solution(int[] numbers) {
        String answer = "";
        String[] strNumbers = new String[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = Integer.toString(numbers[i]);
        }
        
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o2 + o1) - Integer.parseInt(o1 + o2);
            }
        });
        
        for (int i = 0; i < numbers.length; i++) {
            answer = answer.concat(strNumbers[i]);
        }
        
        if (answer.startsWith("0")) return "0";
        
        return answer;
    }
}
