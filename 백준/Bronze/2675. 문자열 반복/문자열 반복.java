import java.io.*;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");

            int a = Integer.parseInt(str[0]);
            String b = str[1];


            for (int j = 0; j < b.length(); j++) {
                for (int k = 0; k < a; k++) {
                    System.out.print(b.charAt(j));
                }
            }
            System.out.println();
        }
    }
}