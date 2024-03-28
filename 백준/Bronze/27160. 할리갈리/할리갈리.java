import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String[] arr = br.readLine().split(" ");
            String fruit = arr[0];
            int num = Integer.parseInt(arr[1]);

            if (map.containsKey(fruit)) {
                int sum = map.get(fruit) + num;
                map.put(fruit, sum);
            } else {
                map.put(fruit, num);
            }
        }

        System.out.println(map.containsValue(5) ? "YES" : "NO");

    }
}
