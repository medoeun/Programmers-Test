public class Day3_15_ArrayStringLength {

    // 배열 원소의 길이
    // ex) ["We", "are", "the", "world!"] -> [2, 3, 3, 6]
    class Solution {
        public int[] solution(String[] strlist) {
            int[] answer = new int[strlist.length];
            for (int i = 0; strlist.length > i; i++) {
                answer[i] = strlist[i].length();
            }
            return answer;

            // Lambda 이중콜론 연산자 공부할 것*
            //return Arrays.stream(strList).mapToInt(String::length).toArray();
        }
    }
}
