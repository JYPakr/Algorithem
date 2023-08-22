package BaekJoon;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Num_10811 {
	
	public static void main(String[] agrs) throws IOException {
		
		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		

		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int[] arr = new int[N + 1];
		int M = Integer.parseInt(st.nextToken());
		int temp;
		
		for (int i = 1; i <= N; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			int start = Integer.parseInt(st.nextToken()); //
			int end = Integer.parseInt(st.nextToken());
			
			
			while (start < end) { //역순으로 출력하는 코드.
				temp = arr[start];
				arr[start] = arr[end];
				arr[end] = temp;
				
				start++;
				end--;
			}
		}
		
		for(int k = 1; k < arr.length; k++) {
			bw.write(arr[k] + " ");
		}
		
		br.close();
		bw.flush();
		bw.close();
		
//		//case 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
//		
//
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		int N = Integer.parseInt(st.nextToken());
//		int[] arr = new int[N + 1];
//		int M = Integer.parseInt(st.nextToken());
//	
//		for (int i = 1; i <= N; i++) {
//			arr[i] = i;
//		}
//
//		for (int i = 0; i < M; i++) {
//			Stack<Integer> stack = new Stack<>();
//			st = new StringTokenizer(br.readLine(), " ");
//			int start = Integer.parseInt(st.nextToken()); 
//			int end = Integer.parseInt(st.nextToken());
//		
//			for (int j = start; j <= end; j++) {
//				stack.push(arr[j]);
//			}
//			
//			for (int j = start; j <= end; j++) {
//				arr[j] = stack.pop();
//			}
//		}
//		
//		for(int k = 1; k < arr.length; k++) {
//			bw.write(arr[k] + " ");
//		}
//		
//		br.close();
//		bw.flush();
//		bw.close();
	}
}
