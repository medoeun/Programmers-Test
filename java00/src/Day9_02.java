import java.util.Scanner;

public class Day9_02 {

    //pcce 2번 피타고라스의 정리
    // 한 줄 수정 디버깅
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 피타고라스 정리 : a^2 + b^2 = c^2
        int a = sc.nextInt();   // 직각삼각형의 한 변의 길이 
        int c = sc.nextInt();   // 직각삼각형의 빗변의 길이

        //b_square : 다른 한 변의 길이의 제곱
        int b_square = c - a;

        // 수정
        int b_square1 = (int) (Math.pow(c, 2) - Math.pow(a, 2));

        // or
        int b_square2 = (c*c) - (a*a);

        // or
        int b_square3 = (c - a) * (c + a);

        //or b_square 정의 위에
        a *= a; c *= c;

        System.out.println(b_square);
    }

}
