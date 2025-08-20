import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        
        List<String> front = new ArrayList<>();
        // String[] front = {};
        // 5인 탑승 기구 = names
        // names 리스트 배열
        // names리스트의 길이가 5~30
        // names 원소의길이는 10이하
        for(int i = 0; i < names.length; i++){
            if(i % 5 == 0){
                front.add(names[i]);
            }
        }
       return front.toArray(new String[0]);
    }
}