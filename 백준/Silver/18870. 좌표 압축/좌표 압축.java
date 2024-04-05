import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        TreeSet<Integer> map = new TreeSet<>();

        String[] str = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(str[i]);
            map.add(arr[i]);
        }

        int x = map.size();
        int idx = 0;
        int[] sortedarr = new int[x];
        for (int num : map) {
            sortedarr[idx++] = num;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            int result = Arrays.binarySearch(sortedarr, arr[i]);
            arr[i] = result;
            sb.append(arr[i]).append(" ");
        }

        System.out.println(sb);
    }
}