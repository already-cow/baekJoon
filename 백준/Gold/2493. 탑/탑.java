import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        Stack<int[]> stack = new Stack<>();

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            while(!stack.isEmpty()){
                if (stack.peek()[1] >= num) {
                    sb.append(stack.peek()[0] + 1).append(" ");
                    break;
                }
                stack.pop();
            }
            if (stack.isEmpty()){
                sb.append(0).append(" ");
            }
            stack.push(new int[]{i, num});
        }

        System.out.println(sb);
    }
}