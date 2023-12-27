import java.util.Scanner;

public class Day11_01 {
    // 문자열 반복해서 출력하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String strn = "";

        for (int i = 0; i < n; i++) {
            strn += str;
        }

        System.out.println(strn);
        
        // repeat 메서드: JAVA 11~
        System.out.println(str.repeat(n));

        // StringBuilder: 변경 가능한 문자열 만들기
        // Stringbuilder.append(): 문자열 연결
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append(str);
        }
        String s = sb.toString();  // 형변환 필수
        System.out.println(s);
        

    }
}
