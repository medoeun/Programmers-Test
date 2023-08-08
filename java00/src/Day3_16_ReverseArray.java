public class Day3_16_ReverseArray {
    // 배열 뒤집기  ex) [1, 2, 3, 4, 5]	[5, 4, 3, 2, 1]
    class Solution {
        public int[] solution(int[] num_list) {
            int[] answer = new int[num_list.length];
            for (int i = num_list.length-1, j = 0; i >= 0; i--, j++) {
                answer[j] = num_list[i];
            }
            return answer;
        }
    }
}
