public class Day14_02 {
    // 문자 arr를 문자열로 변환하기
    // arr의 원소들을 순서대로 이어 붙인 문자열을 return
    public String solution(String[] arr) {

        String answer = "";
        for (String s : arr) {
            answer += s;
        }
        // String.join(separator, values): 문자열 배열 이어붙이기
        // 지정된 separator(구분 기호)를 사용하여 연결
        String answer1 = String.join("", arr);
        return answer;

    }
}
