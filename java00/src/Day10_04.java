public class Day10_04 {
    // pcce 기출 6번: 가채점, 한 줄 수정 디버깅
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;  // 성적문의 학생 수
        String[] answer = new String[num_student];

        // 배열은 0부터 시작임을 잊지 말 것
        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i]-1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
