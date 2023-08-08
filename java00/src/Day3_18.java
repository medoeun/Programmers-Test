public class Day3_18 {
    // 분수의 덧셈
    // 첫 번째 분수의 분자와 분모 numer1, denom1
    // 두 번째 분수의 분자와 분모 numer2, denom2
    // 더한 값의 기약 분수 분자, 분모 배열 return
    class Solution {
        public int[] solution(int numer1, int denom1, int numer2, int denom2) {
            int numer = (numer1*denom2) + (numer2*denom1);
            int denom = denom1*denom2;

            int min = Math.min(numer, denom);
            int max = 1;

            for (int i = 1; i <=min; i++) {
                if( numer % i == 0 && denom % i == 0) {
                    max = i;
                }
            }

            int[] answer = {numer/max, denom/max};
            return answer;
        }
    }
}
