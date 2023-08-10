public class Day5_01 {
    // 배열 두 배 만들기 : numbers의 각 원소에 두배한 원소를 가진 배열을 return하도록
    class Solution {
        public int[] solution(int[] numbers) {

            int[] answer = new int[numbers.length];
            // answer 배열의 크기를 설정하지 않았더니 오류 발생

            for (int i = 0; i < numbers.length; i++) {
                answer[i] = numbers[i] * 2;
            }

            // 향상된 for문
            int i = 0;
            for (int num : numbers) {
                answer[i++] = num * 2;
                // index 순서대로 반복
                // answer[index] = numbers[index] * 2;
            }

            return answer;

            // Stream.map ( 함수 내부 시간 복잡도가 충분히 클 시에만 stream 속도 손실이 없음 )
            // return Arrays.stream(numbers).map(i -> i * 2).toArray();
        }
    }
}
