public class Day6_03 {
    // 피자 나눠 먹기(2)
    // 6조각, n명이 남김 없이 같은 수의 피자 먹어야 하면 필요한 판 수?
    class Solution {
        public int solution(int n) {
            int answer = 0;
            // 6과 n의 최소 공배수 조각이 필요함
            // picies / 6 == picies / n == 0일 때 picies
            int i = 6;

            // 초기화를 바깥에서 하면 세미콜론 붙여줘야됨... 다까먹었네
            for (; i <= 6 * n; i += 6) {
                if (i % 6 == 0 && i % n == 0) {
                    i = i;
                    break;
                }
            }
            answer = i / 6;
            return answer;
        }
    }
}
