public class Day10_03 {
    // pcce 기출 5번: 산책
    // 2차원 좌표평면에서 동/서/남/북 방향으로 1m 단위로 이동하면서 강아지를 산책
    // 도착점의 위치 return
    // 예: route "NSSNEWWN" 입력 시 [-1, 1] 출력
    public int[] solution(String route) {
        int east = 0;
        int north = 0;
        int[] answer = new int[2];
        for (int i = 0; i < route.length(); i++) {
            switch (route.charAt(i)) {
                case 'N':
                    north++;
                    break;
                case 'S':
                    north--;
                    break;
                case 'E':
                    east++;
                    break;
                case 'W':
                    east--;
                    break;
            }
        }
        answer[0] = east;
        answer[1] = north;
        return answer;
    }

}
