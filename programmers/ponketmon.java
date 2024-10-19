import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        
        // 선택할 수 있는 최대의 폰켓몬 수
        answer = nums.length/2;
        
        // 중복이 없는 포켓몬 종류를 담을 변수 선언 HashSet 사용
        Set<Integer> ponketmonKinds = new HashSet<>();
        
        for (int num : nums) {
            ponketmonKinds.add(num);
        }
        
        // 폰켓몬 종류가 선택할 수 있는 최대수 보다 낮을 경우
        if (ponketmonKinds.size() < answer) answer = ponketmonKinds.size();
        
        return answer;
    }
}
