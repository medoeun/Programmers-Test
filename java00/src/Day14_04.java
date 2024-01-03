public class Day14_04 {
    //  더 크게 합치기
    //  두 정수를 붙여서 쓴 값을 반환
    public int solution(int a, int b) {
        int answer = 0;

        String ab = String.valueOf(a) + b;
        String ba = String.valueOf(b) + a;

        // 문자열 정수로 변환: Interger.valueOf(), Integer.parseInt()
        if (Integer.parseInt(ab) >= Integer.parseInt(ba)) {
            answer = Integer.parseInt(ab);
        } else {
            answer = Integer.parseInt(ba);
        }

        // 삼항연산자
        int aB = Integer.parseInt(ab);
        int bA = Integer.parseInt(ba);
        answer = aB >= bA ? aB : bA;

        return answer;
    }

}
