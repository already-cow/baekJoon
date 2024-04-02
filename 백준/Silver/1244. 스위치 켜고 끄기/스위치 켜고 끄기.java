import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        String[] arr1 = br.readLine().split(" ");
        int[] swt = new int[m + 1];

        for (int i = 1; i <= m; i++) {
            swt[i] = Integer.parseInt(arr1[i - 1]);
        }

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String[] arr2 = br.readLine().split(" ");
            int gender = Integer.parseInt(arr2[0]);
            int count = Integer.parseInt(arr2[1]);

            if (gender == 2) {
                int prev = count - 1;
                int next = count + 1;

                for (int j = 1; j <= m; j++) {
                    if (prev >= 1 && next <= m && swt[prev] == swt[next]) {
                        prev--;
                        next++;
                        continue;
                    } break;
                }

                prev++;
                next--;
                for (int k = prev; k <= next; k++) {
                    swt[k] = swt[k] == 0 ? 1 : 0;
                }

            } else {
                int turn = m / count;
                for (int x = 1; x <= turn; x++) {
                    int a = x * count;
                    swt[a] = swt[a] == 0 ? 1 : 0;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= m; i++) {
            sb.append(swt[i]).append(" ");
            if (i % 20 == 0) {
                sb.append("\n");
            }
        }

        System.out.println(sb);
    }
}
