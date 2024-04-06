import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        column[] columns = new column[n];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            columns[i] = new column(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(columns); // 기둥 배열을 위치 오름차순으로 정렬

        int area = 0; // 창고 면적을 누적
        int pivot = 0;
        // 가장 높은 기둥을 pivot으로
        for (int i = 0 ; i < n; i++) {
            if (columns[pivot].high < columns[i].high) pivot = i;
        }

        // 가장 왼쪽 기둥부터 pivot까지
        int highIndex = 0;
        for (int i = 0; i <= pivot; i++) {
            if (columns[highIndex].high <= columns[i].high) {
                area += (columns[i].location - columns[highIndex].location) * columns[highIndex].high;
                highIndex = i;
            }
        }

        // 가장 오른쪽 기둥부터 pivot까지
        highIndex = n - 1;
        for (int i = n - 1; i >= pivot; i--) {
            if (columns[highIndex].high <= columns[i].high) {
                area += (columns[highIndex].location - columns[i].location) * columns[highIndex].high;
                highIndex = i;
            }
        }

        // pivot 기둥의 넓이
        area += columns[pivot].high;

        System.out.println(area);
    }

    // 기둥 클래스, x 좌표와 높이로 구성
    public static class column implements Comparable<column> {
        public int location;
        public int high;

        public column(int location, int high) {
            this.location = location;
            this.high = high;
        }

        // 위치 오름차순을 위해 함수 오버라이딩
        @Override
        public int compareTo(column c) {
            return this.location - c.location;
        }
    }
}