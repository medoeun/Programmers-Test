
public class Day13_06 {
    // 문자열 겹쳐쓰기
    // .substring(int from, int to): 인덱스 from부터 to 이전!까지의 문자열 반환
    // ***** to는 포함되지 않음 *****
    public String solution(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0, s) + overwrite_string + my_string.substring(s+overwrite_string.length(), my_string.length());

        return answer;
    }
}
