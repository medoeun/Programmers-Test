public class Day14_03 {
    // 문자열 곱하기
    //  my_string을 k번 반복한 문자열을 return
    public String solution(String my_string, int k) {
        String answer = "";

        for (int i = 0; i < k; i++) {
            answer += my_string;
        }

        // repeat(): java11~
        answer = my_string.repeat(k);
        return answer;
    }


}


