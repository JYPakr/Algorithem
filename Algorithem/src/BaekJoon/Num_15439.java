package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Num_15439 {
	
	public static void main(String[] agrs) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        // N
        int N = Integer.parseInt(br.readLine());

        sb.append(N*(N-1));
        br.close();
        System.out.print(sb);
   
	}
}
