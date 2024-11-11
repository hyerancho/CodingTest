class Solution {
    public int solution(int a, int b) {
        
        int first = Integer.parseInt("" + a + b);
        int second = 2 * a * b; 
        
        return Math.max(first, second);
    }
}