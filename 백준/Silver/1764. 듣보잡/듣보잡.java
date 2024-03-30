import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> map = new HashSet<>();

        for (int i = 0; i < n; i++) {
            map.add(br.readLine());
        }

        int sum = 0;
        List<String> list = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String str = br.readLine();
            if (map.contains(str)) {
                list.add(str);
                sum++;
            }
        }

        Collections.sort(list);
        System.out.println(sum);

        for (String x : list) {
            System.out.println(x);
        }
    }
}