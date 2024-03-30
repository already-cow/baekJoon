import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");

        StringBuilder sb = new StringBuilder();
        while (st.hasMoreTokens()) {
            sb.append(String.valueOf(st.nextToken().charAt(0)));
        }

        System.out.println(sb);
    }
}
