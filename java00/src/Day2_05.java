public class Day2_05 {
    public static void main(String[] args) {
        class Solution {
            public int solution(int num1, int num2) {
/*                int answer = 0;
                if (num1 == num2) {
                    answer = 1;
                } else {
                    answer = -1;
                }
                return answer;
*/
                // 삼항연산자
                return num1 == num2 ? 1 : -1;
            }
        }
    }
}
