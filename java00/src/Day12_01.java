
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Day12_01 {

    // 대소문자 바꿔서 출력하기: 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        // 1. 아스키 코드값 활용
        // 소문자 97~122, 대문자 65~90 : 32차이

        // 문자열을 문자 배열로
        char[] strChar = a.toCharArray();
        int[] strAsc = new int[strChar.length];

        for (int i = 0; i < strChar.length; i++) {
            if ((int) strChar[i] <= 90) {
                strAsc[i] = (int) strChar[i] + 32;
            } else {
                strAsc[i] = (int) strChar[i] - 32;
            }
        }

        for (int i = 0; i < strAsc.length; i++) {
            strChar[i] = (char) strAsc[i];
        }

        String str = new String(strChar);

        System.out.println(str);

        // 2. Character.toLowerCase, toUpperCase, isUpperCase, isLowerCase
        // 배열이 아닌 임시변수 temp에 담기
        // charAt() : String의 특정 인덱스 문자를 char로
        char temp;
        String str2="";
        for (int i = 0; i < a.length(); i++) {
            temp = a.charAt(i);
            if (Character.isUpperCase(temp)) {
                str2 += Character.toLowerCase(temp);
            } else {
                str2 += Character.toUpperCase(temp);
            }
        }
        System.out.println(str2);

    }


}
