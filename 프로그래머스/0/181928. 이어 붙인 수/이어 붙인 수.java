class Solution {
    public int solution(int[] num_list) {
        String oddStr = "";
        String evenStr = "";
        //홀수만 이어붙인 수
        // 짝수만 이어붙인 수의 합 
        //1234567 1357 2468
        for(int i : num_list) {
            if(i % 2 == 0){
                oddStr += i;  
            } else
                evenStr += i;
        }
        
        int oddNum = Integer.parseInt(oddStr);
        int evenNum = Integer.parseInt(evenStr);
        
        
        return oddNum + evenNum;
    }
}