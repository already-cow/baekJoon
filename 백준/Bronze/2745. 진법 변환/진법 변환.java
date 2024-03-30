import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        StringBuilder sb = new StringBuilder(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int x = 0;
        int sum = 0;

        for (int i = sb.length() - 1; i >= 0; i--) {
            char a = sb.charAt(i);
            int pow = (int) Math.pow(n, x);

            if ('A' <= a && a <= 'Z') {
                sum += (a - 'A' + 10) * pow;
            } else {
                sum += (a - '0') * pow;
            }
            x++;
        }

        System.out.println(sum);
    }
}
