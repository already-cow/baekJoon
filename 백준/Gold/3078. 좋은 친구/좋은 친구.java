import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer>[] queues = new Queue[21];
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());


        for (int i = 0; i < 21; i++) {
            queues[i] = new LinkedList<>();
        }

        long count = 0;
        for (int i = 0; i < N; i++) {
            int length = br.readLine().trim().length();

            if(queues[length].isEmpty()){
                queues[length].offer(i);
            } else {
                while(i- queues[length].peek() > K){
                        queues[length].poll();
                        if(queues[length].isEmpty()){
                            break;
                        }
                }

                count += queues[length].size();
                queues[length].offer(i);
            }
        }


        System.out.println(count);
    }
}