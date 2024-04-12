import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i < N; i++) {
            pq.offer(Integer.parseInt(st.nextToken()));
        }

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = pq.poll();
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine(), " ");
        int result;
        for (int i = 0; i < M; i++) {
            int num = Integer.parseInt(st.nextToken());
            result = Arrays.binarySearch(arr, num) >= 0 ? 1 : 0;
            System.out.println(result);
        }
    }
}