import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Day8_01 {

    // 매개변수 n이하의 홀수 오름차순 배열 return 
    // 내 풀이
    class Solution {
        public int[] solution(int n) {

            ArrayList<Integer> arrList = new ArrayList<Integer>();

            for (int i = 0; i <= n; i++) {
                if (i % 2 != 0) {
                    arrList.add(i);
                }
            }

            int[] answer = new int[arrList.size()];

            for (int j = 0; j < arrList.size(); j++) {
                answer[j] = arrList.get(j);
            }

            Arrays.sort(answer);

            return answer;
        }
    }

    // 스트림, 람다 사용
    class Solution2 {
        public int[] solution(int n) {
            return IntStream.rangeClosed(0, n).filter(value -> value % 2 == 1).toArray();
            
            /*
            IntStream.rangeClosed(0, n): IntStream은 Java 8의 스트림 API에서 제공하는 정수 스트림을 다루는 클래스입니다.
            rangeClosed 메서드는 시작값(0)부터 끝값(n)까지의 정수 스트림을 생성합니다.

            .filter(value -> value % 2 == 1): 생성된 정수 스트림을 필터링합니다.
            홀수인 경우만 필터링하도록 람다 표현식(value -> value % 2 == 1)을 사용합니다.
            이 표현식은 홀수일 때 true를 반환하며, 따라서 홀수만 남게 됩니다.

            .toArray(): 필터링된 정수 스트림을 배열로 변환하여 반환합니다.
            이렇게 반환된 배열에는 0부터 n까지의 홀수 값들이 담겨 있습니다.

            이 코드는 Java 8의 스트림과 람다 표현식을 활용하여 간결하게 작성되었습니다.
            주어진 n에 대해 0부터 n까지의 홀수 값을 배열로 반환하는 기능을 가지고 있습니다.
*/
        }
    }
}
