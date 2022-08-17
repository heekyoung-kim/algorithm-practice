package algorithmTest;

import java.util.Scanner;

public class P11720_numberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;

        for(int i = 0; i < cNum.length; i++) {
            sum += cNum[i] - '0'; // 문자열 0 혹은 48을 -해주면 int 형태로 변환.
        }
        System.out.println(sum);
    }
}
