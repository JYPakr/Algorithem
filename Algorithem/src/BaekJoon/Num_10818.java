package BaekJoon;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Num_10818 {
	
	public static void main(String[] args) throws IOException{
		
	
		
		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		int index = 0;
		int[] arr = new int[N];
		
		while(st.hasMoreTokens()) {
			arr[index] = Integer.parseInt(st.nextToken());
			index++;
		}
		
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
		
		
//		//case 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		StringTokenizer st = new StringTokenizer(br.readLine());
//	
//		int max = 0;
//	
//		int index = 0;
//		
//		while(st.hasMoreTokens()) {
//			int val = Integer.parseInt(br.readLine());
//			
//			index++;
//			
//			if (val > max) {
//				max = val;
//			
//			}
//			
//		}
//		System.out.println(max);
//		System.out.println(index);
		
	}
}
