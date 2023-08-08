public class Day3_17_NumberOfEvenOddInArray {
    // 짝수 홀수 개수 ex) [1, 2, 3, 4, 5] -> [2, 3] [짝, 홀] 0, 1, 2, 3, 4
    class Solution {
        public int[] solution(int[] num_list) {

            // 내 풀이
            int even = 0;
            int odd = 0;
            for (int i = 0; i < num_list.length; i++) {
                if (num_list[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }

            int[] answer = {even, odd};
            return answer;

            // 향상된 for문
/*
            for (int num : num_list) {
                if (num % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
*/

            // 다른 풀이: 2로 나눈 나머지는 짝수일 때 0, 홀수일 때 1
            // answer[0] = 짝, answer[1] = 홀이므로 각각의 경우에 인덱스에 1씩 더해주면 됨
/*
            for(int i = 0; i < num_list.length; i++)
                answer[num_list[i] % 2]++;
*/
        }
    }
}
