import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] arr = new int[9][9];

        int max = 0;
        int a = 0;
        int b = 0;

        for (int i = 0; i < 9; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < 9; j++) {
                arr[i][j] = Integer.parseInt(str[j]);

                if (arr[i][j] >= max) {
                    max = arr[i][j];
                    a = i + 1;
                    b = j + 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(a + " " + b);
    }
}
