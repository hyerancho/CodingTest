class Solution {
    public int[] solution(int start_num, int end_num) {
        // 배열의 크기 변수 선언
        int[] answer = new int[end_num - start_num + 1];
        
        for (int i = 0; i < answer.length;i++){
            answer[i] = start_num;
            start_num++;
        }
        return answer;
    }
}