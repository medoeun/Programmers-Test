public class Day2_10 {
    public static void main(String[] args) {
        class Solution {
            public double solution(int[] numbers) {
                double answer = 0, sum = 0;
                for (int obj : numbers) {
                    sum += obj;
                }
                answer = sum / numbers.length;
                return answer;
            }

//            arrays.stream
//            public double solution(int[] numbers) {
//                return Arrays.stream(numbers).average();
//            }

        }
    }
}
