class Solution {
    public String solution(String code) {
        int mode = 0; // 초기 mode는 0
        StringBuilder ret = new StringBuilder(); // 결과 문자열 저장

        for (int idx = 0; idx < code.length(); idx++) {
            char currentChar = code.charAt(idx);

            if (currentChar == '1') {
                mode = 1 - mode; // mode 변경
            } else {
                if (mode == 0 && idx % 2 == 0) {
                    ret.append(currentChar); // mode 0에서 짝수 인덱스만 추가
                } else if (mode == 1 && idx % 2 == 1) {
                    ret.append(currentChar); // mode 1에서 홀수 인덱스만 추가
                }
            }
        }

        // 결과 문자열이 빈 경우 "EMPTY" 반환
        return ret.length() > 0 ? ret.toString() : "EMPTY";
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // 테스트 케이스
        System.out.println(solution.solution("0123456789")); // 예시 출력
        System.out.println(solution.solution("11111")); // "EMPTY"
        System.out.println(solution.solution("1010101")); // "000"
    
    }
}