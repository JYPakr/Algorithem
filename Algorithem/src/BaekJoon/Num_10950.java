package BaekJoon;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Num_10950 {
	public static void main(String[] agrs) throws IOException {
		
		
		//case 1
//		Scanner in = new Scanner(System.in);
//		
//		int c = in.nextInt();
//		int arr[] = new int[c];
//		
//		for (int i = 0; i < c; i++) {
//			int a = in.nextInt();
//			int b = in.nextInt();
//			arr[i] = a + b;
//		}
//		in.close();
//		
//		for (int k : arr) {
//			System.out.println(k);
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
	
		for (int i = 0; i < N; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
			sb.append('\n');
		}
		br.close();
		
		System.out.println(sb);
	}
}
