import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        System.out.println(Math.max(reverseNum(a), reverseNum(b)));
    }

    public static int reverseNum(int num){
        String str = String.valueOf(num);
        StringBuilder trs = new StringBuilder(str).reverse();
        num = Integer.parseInt(trs.toString());

        return num;
    }
}