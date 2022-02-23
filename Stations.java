class Stations {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int sIndex = 0;
        int position = 1;
        
        while(position <= n) {
            if (sIndex < stations.length && stations[sIndex] - w <= position) {
                position = stations[sIndex] + w + 1;
                sIndex++;
            } else {
                answer++;
                position += w*2 + 1;
            }
        }
      
        return answer;
    }
}
