import java.time.LocalDate;

public class Day2_04_PrintAge {
    public static void main(String[] args) {
        class Solution {
            public int solution(int age) {
//                int answer = (2022 - age) + 1;
//                return answer;
//                연도가 조건이 아닐 경우
                LocalDate today = LocalDate.now();
                return today.getYear() - age + 1;
            }
        }
    }
}
