import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long x = Long.parseLong(st.nextToken());
        long y = Long.parseLong(st.nextToken());

        long z = (y * 100) / x;
        long result = -1;

        // Z가 변하지 않을 경우
        if (z >= 99) {
            System.out.println(result);
            return;
        }

        long left = 1;
        long right = x;
        while (left <= right) {
            long mid = (left + right) / 2;
            long games = x + mid;
            long wins = y + mid;

            long rate = (wins * 100) / games;

            if (rate > z) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        System.out.println(result);
    }
}