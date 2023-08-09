import java.util.Arrays;

public class Day4_01 {
    class Solution {
        public String solution(String my_string) {
            char[] reverseArr = new char[my_string.length()];

            // length : 배열의 길이
            // length() : 문자열의 길이
            // size() : Collection Object(ArrayList, Set etc)의 길이

            //charAt(index)
            for (int i = my_string.length() - 1, j = 0; i >= 0; i--, j++) {
                reverseArr[j] = my_string.charAt(i);
            }


            // (x)
            // Arrays.toString : 배열 형대로 리턴
            // String answer = Arrays.toString(reverseArr);

            // (O)
            // 1) Arrays의 copyOf 메서드 호출
            String answer = new String(reverseArr);

            // 2) valueOf 메서드
            String answer2 = String.valueOf(reverseArr);

            // 3) StringBuilder
            StringBuilder sb = new StringBuilder();
            // append() : concat()보다 속도가 빠르다. 인수로 전달된 값을 문자열 변환 후
            //            문자열의 마지막에 이어붙임. 여기서는 StringBuilder에 입력

            sb.append(my_string);
            // reverse() : StringBuilder, StringBuffer, Collection 클래스. 문자열 뒤집기 메서드
            sb.reverse();
//            return sb.toString();

            return answer;
        }
    }
}
