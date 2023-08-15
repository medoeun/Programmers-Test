public class Day6_02 {
    // 피자 나눠먹기
    // 7조각 피자를 사람 n명이 모두 한 조각 이상 먹을 수 있는 피자 수
    class Solution {
        public int solution(int n) {
            int answer = 0;

            if (n % 7 == 0) {
                answer = n / 7;
            } else {
                answer = n / 7 + 1;
            }

            // 삼항 연산자  조건식 ? 반환값1 : 반환값2
            answer = (n % 7 == 0) ? (n / 7) : (n / 7 + 1);

            return answer;
        }
    }
}
