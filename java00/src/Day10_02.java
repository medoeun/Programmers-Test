import java.util.Scanner;

// pcce 기출 4번: 저축
// 목표 금액: 100만원, 70만원까지 조금씩 저축 후 70오버부터 저축량 up
// 필요한 개월 수 출력
public class Day10_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();   // 첫 달 입금액
        int before = sc.nextInt();  // 두 번째 달부터 70까지
        int after = sc.nextInt();   // 70부터 100까지

        int money = start;
        int month = 1;
        while (money < 70) {
            money += before
            ;
            month++;
        }
        while ( money < 100) {
            money += after
            ;
            month++;
        }

        System.out.println(month);
    }

}
