package Implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2816 {

    static String[] ch;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        ch = new String[N];
        for (int i = 0; i < N; i++) {
            ch[i] = br.readLine();
        }

        StringBuilder res = new StringBuilder();

        int idx = 0;
        while(!ch[idx].equals("KBS1")) {
            idx++;
            res.append("1");
        }

        while(idx > 0) {
            swap(idx, idx - 1);
            idx--;
            res.append("4");
        }

        while(!ch[idx].equals("KBS2")) {
            idx++;
            res.append("1");
        }

        while(idx > 1) {
            idx--;
            res.append("4");
        }

        System.out.println(res);
    }

    private static void swap(int i, int j) {
        String tmp = ch[i];
        ch[i] = ch[j];
        ch[j] = tmp;
    }
}
