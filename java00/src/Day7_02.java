import java.util.Arrays;


public class Day7_02 {
    // 최빈값 구하기... 이런것도 어렵다ㅜ
    class Solution {
        public int solution(int[] array) {

            Arrays.sort(array);
            int max = array[array.length - 1];

            int[] count = new int[max + 1];

            for (int i = 0; i <= array.length - 1; i++) {
                count[array[i]]++;
            }

            int countmax = count[0];
            int answer = 0;

            for (int j = 1; j <= count.length - 1; j++) {
                if (countmax < count[j]) {
                    countmax = count[j];
                    answer = j;
                } else if (countmax == count[j]) {
                    answer = -1;
                }
            }
            return answer;


            //HasMap 사용
/*
            Map<Integer, Integer> map = new HashMap<>();
            for (int number : array) {
                int count = map.getOrDefault(number, 0) + 1;
                if (count > maxCount) {
                    maxCount = count;
                    answer = number;
                } else if (count == maxCount) {
                    answer = -1;
                }
                map.put(number, count);
            }
            return answer;
*/

        }
    }
}
