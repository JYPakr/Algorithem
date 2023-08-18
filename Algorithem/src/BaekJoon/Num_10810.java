package BaekJoon;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;



public class Num_10810 {
	
	public static void main(String[] agrs) throws IOException {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N];
		int M = Integer.parseInt(st.nextToken());
		

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int I = Integer.parseInt(st.nextToken());
			int J = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			for (int j = I - 1; j < J; j++) {
				arr[j] = K;
			}
		}
		
		for(int k = 0; k < arr.length; k++) {
			bw.write(arr[k] + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
	}
}
