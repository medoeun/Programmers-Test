import java.util.Arrays;

public class Day7_01 {

    // 중앙값 구하기: 배열을 오름차순 정렬하여 중앙값을 return
    // ex) [9, -1, 0] --> 0  배열 길이는 홀수
    class Solution {
        public int solution(int[] array) {

            Arrays.sort(array);

            int num = array.length / 2;

            int answer = array[num];
            return answer;
        }
    }

}
