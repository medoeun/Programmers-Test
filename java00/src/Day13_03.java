import java.util.Scanner;

public class Day13_03 {
    // 문자열 붙여서 출력
    // str1, str2를 공백없이 이어서 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a+b);
        
        // concat: 텍스트 붙이기
        // s1.concat(s2)
        String str = a.concat(b);
        System.out.println(str);
    }


}
