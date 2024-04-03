import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            Stack<Character> stack = new Stack<>();
            String str = br.readLine();

            boolean a = true;

            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == '('){
                    stack.push(str.charAt(j));
                } else if (stack.isEmpty()) {
                    a = false;
                    break;
                } else {
                    stack.pop();
                }
            }
            System.out.println(a && stack.isEmpty() ? "YES" : "NO");
        }
    }
}