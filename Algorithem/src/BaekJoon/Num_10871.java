package BaekJoon;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class Num_10871 {
	
	public static void main(String[] args) throws IOException{
		
//		//case 1
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int X = sc.nextInt();
//
//		int arr[] = new int[N];
//		
//		for (int i = 0; i < N; i++) {
//		
//			arr[i] = sc.nextInt();
//			if (arr[i] < X) {
//				System.out.print(arr[i] + " ");
//			}
//		}
//		
//		sc.close();
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int N = Integer.parseInt(st.nextToken());
		int X = Integer.parseInt(st.nextToken());
	
		StringBuilder sb = new StringBuilder();
		
		st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i++) {
			int val = Integer.parseInt(st.nextToken());
			if (val < X) {
				sb.append(val).append(' ');
			}
		}
		br.close();
		System.out.println(sb);
	
		

	}
}
