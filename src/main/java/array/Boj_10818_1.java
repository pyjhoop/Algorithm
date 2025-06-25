package array;

import java.util.*;
import java.io.*;

public class Boj_10818_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        String result = solution(n, arr);

        System.out.println(result);
    }

    static String solution(int n, int[] arr){
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        sb.append(arr[0]).append(" ").append(arr[n-1]);
        return sb.toString();
    }
}
