import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String a = st.nextToken();

            if (a.equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
            }

            if (a.equals("pop")) {
                sb.append(stack.isEmpty() ? -1 : stack.pop()).append("\n");
            }

            if (a.equals("size")) {
                sb.append(stack.size()).append("\n");
            }

            if (a.equals("empty")) {
                sb.append(stack.isEmpty() ? 1 : 0).append("\n");
            }

            if (a.equals("top")) {
                sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n");
            }
        }
        System.out.println(sb);
    }
}