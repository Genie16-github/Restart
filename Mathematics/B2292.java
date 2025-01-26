package Mathematics;

import java.util.Scanner;

public class B2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int cnt = 1;
        int r = 2;

        if (N == 1) {
            System.out.println(1);
        }
        else {
            while (r <= N) {
                r = r + (6 * cnt);
                cnt++;
            }
            System.out.println(cnt);
        }
    }
}
