class Carpet {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        
        for (int h=1; h <= yellow; h++) {
            if (yellow % h == 0 && (yellow/h) >= h) {
                int b = ((yellow/h) + 2) * (h + 2) - yellow;
                    
                if (b == brown) {
                    answer[0] = (yellow/h) + 2;
                    answer[1] = h + 2;
                }
            }
        }
        
        return answer;
    }
}
