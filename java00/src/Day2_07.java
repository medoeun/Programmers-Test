public class Day2_07 {
    public static void main(String[] args) {

        class Solution {
            public int solution(int num1, int num2) {
//              형변환!!
                float f = (float) num1 / num2 * 1000;
                return (int) f;

//              혹은
//                int answer = 0;
//                return num1 * 1000 / num2;
            }
        }
    }
}
