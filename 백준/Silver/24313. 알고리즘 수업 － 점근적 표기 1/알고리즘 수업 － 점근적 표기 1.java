import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a0 = Integer.parseInt(st.nextToken());
        int a1 = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int sum = 0;
        for (int i = n; i <= 100; i++) {
            sum = (a0 * i + a1 <= c * i) ? sum + 1 : sum;
        }

        System.out.println(sum == 101 - n ? 1 : 0);
    }
}