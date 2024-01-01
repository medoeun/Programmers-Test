import java.util.Scanner;

public class Day13_05 {
    // 홀짝 구분
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n % 2 == 0) {
            System.out.println(n + " is even");
        } else {
            System.out.println(n + " is odd");
        }

        // 삼항연산자 사용
        // 조건식 ? 반환값1 : 반환값2
        // 조건식이 true면 1, false면 2 반환
        System.out.print(n + " is "+(n % 2 == 0 ? "even" : "odd"));

    }
}
