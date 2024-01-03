public class Day14_01 {
    // 문자열 섞기
    // 두 문자열의 각 문자가 앞에서부터 서로 번갈아가면서 한 번씩 등장하는 문자열을 만들어 return
    public String solution(String str1, String str2) {

        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);

            
            // 먼저 answer을 ""로 문자열 선언했기 때문에 문자열로 += 가능
            // 만약 바로 charAt을 문자열로 형변환 하려면 String.valueOf()
            // cf. toString(): toString은 npe 발생, Object 값이 String이 아니어도 출력
            // valueOf()은 파라미터로 null이 오면 "null" 출력
        }

        return answer;
    }

}
