import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Day1_02_PrintAB {
    // BuffredReader 사용 시 반드시 exception 처리
    public static void main(String[] args) throws IOException {

/*        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        sc.close();*/

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        // readLine() : method of BufferedReader, String 고정 -> 형변환 필수
//        int num = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        bw.write("a = " + Integer.parseInt(st.nextToken())+"\n");
        bw.write("b = " + Integer.parseInt(st.nextToken()));

        br.close();
        bw.flush();
        bw.close();

    }
}
