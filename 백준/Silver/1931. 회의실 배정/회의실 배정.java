import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Room[] arr = new Room[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int start = Integer.parseInt(st.nextToken());
            int end= Integer.parseInt(st.nextToken());
            arr[i] = new Room(start, end);
        }

        // 종료 시간 기준으로 정렬
        Arrays.sort(arr);

        int time = 0;
        int count = 0;
        for (int i = 0; i < N; i++) {
            if (time <= arr[i].start) {
                count++;
                time = arr[i].end;
            }
        }

        System.out.println(count);
    }

    public static class Room implements Comparable<Room> {
        int start;
        int end;

        public Room(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public int compareTo(Room time) {
            return end == time.end ? start - time.start : end - time.end;
        }
    }

}
