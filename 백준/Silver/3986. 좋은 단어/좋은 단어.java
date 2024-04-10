import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            Stack<Character> stack = new Stack<>();

            stack.push(word.charAt(0));

            for (int j = 1; j < word.length(); j++) {
                if (stack.size() > 0 && stack.peek() == word.charAt(j)) {
                    stack.pop();
                } else {
                    stack.push(word.charAt(j));
                }
            }

            if (stack.empty()) {
                count++;
            }
        }

        System.out.println(count);
    }
}