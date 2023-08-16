package BaekJoon;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Num_10818 {
	
	public static void main(String[] args) throws IOException{
		
//		//case 1
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int[] arr = new int[N];
//		
//		for (int i = 0; i < N; i++) {
//			arr[i] = sc.nextInt();
//		}
//		
//		sc.close();
//		Arrays.sort(arr);
//		System.out.print(arr[0] + " " + arr[N -1]);
//		
		
//		//case 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int N = Integer.parseInt(br.readLine());
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//	
//		int index = 0;
//		int[] arr = new int[N];
//		
//		while(st.hasMoreTokens()) {
//			arr[index] = Integer.parseInt(st.nextToken());
//			index++;
//		}
//		
//		Arrays.sort(arr);
//		System.out.print(arr[0] + " " + arr[N - 1]);
//		
		
		//case 3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int max = -1000001;
		int min = 1000001;
		
		while(st.hasMoreTokens()) {
			int val = Integer.parseInt(st.nextToken());
			
			if(val > max) {
				max = val;
			}
			
			if(val < min) {
				min = val;
			}
			
		}
		System.out.println(min + " " + max);
		
	}
}
