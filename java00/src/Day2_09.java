public class Day2_09 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int n) {
//                내 풀이
//                int answer = 0;
//
//                for (int i = 0; i <= n; i++) {
//                    if (i % 2 == 0) {
//                        answer += i;
//                    }
//                }
//                return answer;

//                그냥 2씩 더하기
                int answer = 0;
                for (int i=2; i<=n; i+=2) {
                    answer += i;
                }
                return answer;
            }
        }
    }
}
