import java.util.Scanner;

public class Day13_04 {

    // 문자열 돌리기: 개행문자 넣어서 한 글자씩 출력
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (int i = 0; i < a.length(); i++) {
            System.out.println(a.charAt(i));
        }

    }
}
