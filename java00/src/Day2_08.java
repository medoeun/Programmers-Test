public class Day2_08 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int angle) {
                if (angle < 90) {
                    angle = 1;
                } else if (angle == 90) {
                    angle = 2;
                } else if (angle <180) {
                    angle = 3;
                } else if (angle == 180) {
                    angle = 4;
                }
                int answer = angle;
                return answer;
            }
        }
    }
}
