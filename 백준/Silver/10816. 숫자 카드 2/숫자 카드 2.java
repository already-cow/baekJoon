import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            int a = Integer.parseInt(st1.nextToken());
            map.put(a, map.containsKey(a) ? map.get(a) + 1 : 1);
        }

        int M = Integer.parseInt(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(st2.nextToken());
            StringBuilder result = map.containsKey(a) ? sb.append(map.get(a)).append(" ") : sb.append("0 ");
        }

        System.out.println(sb);
    }
}