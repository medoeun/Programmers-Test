public class Day3_14 {
    class Solution {
        // 점의 위치 구하기 (x,y)
        public int solution(int[] dot) {
            int x, y = 0;
            x = dot[0];
            y = dot[1];

            int answer = 0;
            if (x > 0 && y > 0) {
                answer = 1;
            } else if (x < 0 && y > 0) {
                answer = 2;
            } else if (x < 0 && y < 0) {
                answer = 3;
            } else if (x>0 && y<0) {
                answer = 4;
            }
            return answer;
        }
    }

}
