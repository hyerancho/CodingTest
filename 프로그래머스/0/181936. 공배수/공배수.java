class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        // n의 배수이면서 m의 배수이면 1
        // 아니면 0
         if(number % n == 0 && number % m == 0){
             return 1;
         } else 
            return 0;
       
    }
}