import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PriorityQueue<Long> pq = new PriorityQueue<>();
        String[] str = br.readLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            pq.offer(Long.parseLong(st.nextToken()));
            }

        for (int i = 0; i < m; i++) {
            Long x = pq.poll();
            Long y = pq.poll();
            Long sum = x + y;
            pq.offer(sum);
            pq.offer(sum);
        }

        Long sum = 0L;
        for (Long num : pq) {
            sum += num;
        }

        System.out.println(sum);

     }
}