import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[26];
        String a = br.readLine().toUpperCase();

        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i) - 'A']++;
        }

        int max = 0;
        int num = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                num = i;
            } else if (arr[i] == max) {
                num = -2;
            }
        }
        System.out.println((char)(num + 65));
    }
}