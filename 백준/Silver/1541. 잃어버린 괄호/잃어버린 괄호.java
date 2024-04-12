import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] minus = br.readLine().split("-");

        int result = 0;
        for (int i = 0; i < minus.length; i++) {
            int add = 0;
            // 이스케이프 문자를 사용하여 특수문자가 아닌 리터럴 문자로 취급
            String[] plus = minus[i].split("\\+");
            for (int j = 0; j < plus.length; j++) {
                add += Integer.parseInt(plus[j]);
            }
            if (i == 0) {
                result += add;
            } else {
                result -= add;
            }
        }
        System.out.println(result);
    }
}

