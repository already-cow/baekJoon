import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        PriorityQueue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer a, Integer b) {
                return Math.abs(a) == Math.abs(b) ? Integer.compare(a, b) : Integer.compare(Math.abs(a), Math.abs(b));
            }
        });

        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0 && pq.isEmpty()) {
                sb.append(0).append("\n");
            } else if (num == 0 && !pq.isEmpty()) {
                sb.append(pq.poll()).append("\n");
            } else {
                pq.offer(num);
            }
        }

        System.out.println(sb);

    }
}

