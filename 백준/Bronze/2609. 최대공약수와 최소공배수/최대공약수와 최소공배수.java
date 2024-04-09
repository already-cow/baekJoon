import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int max = Math.max(N, M);
		int min = Math.min(N, M);
		int a = max;
		int b = min;
		
		//b출력까지 유클리드 호제법(최대공약수 구하기)
		while(a % b != 0) {
			int a_b = a;
			a = b;
			b = a_b % b;
		}
		System.out.println(b);
		
		//max 출력까지 최소공배수 구하기
		int i = max;
		while(max % min != 0) {
			max += i;
		}
		System.out.println(max);
	}

}