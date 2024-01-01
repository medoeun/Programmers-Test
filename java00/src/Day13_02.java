import java.util.Scanner;

public class Day13_02 {
    // 덧셈식 출력하기
    // a, b가 주어질 때 a+b = c 라는 계산식을 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + " + " + b + " = " + (a + b));
        
        // 혹은 printf: 서식이 있는 출력
        // %d : 정수를 입력
        System.out.printf("%d + %d = %d", a, b, a+b);
        
        // %f : 실수 입력
        // %c : 문자 입력
        // %s : 문자열 입력
    }

}
