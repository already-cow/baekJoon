import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        int start = 1;
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());

            if (num >= start) {
                for (int j = start; j <= num; j++) {
                    stack.push(j);
                    sb.append("+").append("\n");
                }
                start = num + 1;
            }
            if (stack.peek() != num) {
                System.out.println("NO");
                // 프로그램 즉시 종료
                System.exit(0);
            }

            stack.pop();
            sb.append("-").append("\n");
        }
        System.out.println(sb);
    }
}