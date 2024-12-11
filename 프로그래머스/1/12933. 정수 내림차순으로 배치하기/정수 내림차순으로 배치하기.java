class Solution {
    public long solution(long n) {
        // 내림차순으로 정렬하기
        char[] digits = String.valueOf(n).toCharArray(); 
        
        for(int i = 0; i < digits.length; i++){
            // 배열을 여러번 반복하며 큰 값부터 차레대로 제자리를 찾아간다
            // 배열의 크기가 digits.lenth일때 최대로 digits.lenth - 1번 반복이 필요합니다. 왜냐면 마지막 값은 
            // 배열의 크기가 digits.length [118372] 012345
            /* 패스(i)가 증가할 수록 정렬된 값은 비교대상에서 제외 */
            // 장렬이 끝난 마지막 부분은 더이상 내부루프에서 확인하지 않는다.
            for(int j = 0; j < digits.length - 1 - i; j++){
                if(digits[j] < digits[j + 1]){
                    char temp = digits[j];
                    digits[j] = digits[j + 1];
                    digits[j+1] = temp;     
                }
            }
            
            
        }
         return Long.parseLong(new String(digits));   
    }
}