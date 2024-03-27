import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] arr = br.readLine().split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int sum = 0;

        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        int[] date = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

        for (int i = 0; i < a; i++) {
            sum += date[i];
            }

        System.out.println(day[(sum + b) %7]);
        
    }
}




