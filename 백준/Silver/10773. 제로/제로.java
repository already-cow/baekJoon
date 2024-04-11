import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            int K = Integer.parseInt(br.readLine());
            if (K == 0) {
                stack.pop();
            } else {
                stack.push(K);
            }
        }

        int sum = 0;
        int size = stack.size();
        if (size == 0) {
        } else {
            for (int i = 0; i < size; i++) {
                sum += stack.pop();
            }
        }

        System.out.println(sum);
    }
}