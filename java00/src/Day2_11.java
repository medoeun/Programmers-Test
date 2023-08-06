public class Day2_11 {
    class Solution {
        public int solution(int n, int k) {
//          양꼬치: n , 음료수: k, 10인분 먹을 시 음료수 1개
            int tmp = 0;
            tmp = (int) n / 10;
            int answer = (n*12000) + (k*2000) - (tmp*2000);
            return answer;
        }
    }
}
