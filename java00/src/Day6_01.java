import java.util.Arrays;

public class Day6_01 {

    // 배열 자르기 : numbers[nm1]~[nm2]까지 자른 정수 배열 return
    class Solution {
        public int[] solution(int[] numbers, int num1, int num2) {
            int[] answer = new int[num2 - num1 + 1];

            // 일을 두번 하네...ㅜㅜ
/*
            for (int i = 0, j = num1; i <= num2 - num1;
                 i++, j++) {
                answer[i] = numbers[j];
            }
*/
            // 똑똑하다
            for (int i = num1; i <= num2; i++) {
                answer[i-num1] = numbers[i];
            }

            // 가장 많은 풀이
            int idx = 0;
            for(int i = num1; i<=num2; i++){
                answer[idx] = numbers[i];
                idx++;
            }

            // Arrays.copyOfRange(); 특정 범위만큼 배열 복사하여 새로운 배열 만들기
            // for과 속도는 같았음
            answer =  Arrays.copyOfRange(numbers, num1, num2 + 1);
            // numbers에서, num1 <= index < num2 배열 생성

            return answer;
        }
    }
}
