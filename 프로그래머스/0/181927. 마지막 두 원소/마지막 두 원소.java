import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
     int last = num_list[num_list.length - 1];
        int secondLast = num_list[num_list.length - 2];
        
        // 새로운 값을 계산
        int newValue;
        if (last > secondLast) {
            newValue = last - secondLast;
        } else {
            newValue = last * 2;
        }

        // 결과 배열 생성
        int[] result = Arrays.copyOf(num_list, num_list.length + 1);
        result[result.length - 1] = newValue;

        return result;
    }
}