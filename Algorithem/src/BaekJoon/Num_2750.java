package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num_2750 {
	
	public static void main(String[] agrs) throws IOException{
		
		
//		//case 1 선택정렬
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		int [] arr = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			
//			arr[i] = Integer.parseInt(br.readLine());
//
//		}
//		
//		Arrays.sort(arr);
//		
//		for(int val : arr) {
//			System.out.println(val);
//		}
		
		
//		//case 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		int [] arr = new int[n];
//		
//		for(int i = 0; i < n; i++) {
//			
//			for(int j = 0; j < n; j++) { 
//				
//				if(arr[i] > arr[j]) {
//					//값 교환
//					int temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//					
//				}
//				
//			}
//			
//		}
//		
//		for(int val : arr) {
//			System.out.println(val);
//		}
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[2001];
		
		for(int i = 0; i < n; i++) {
			
			arr[Integer.parseInt(br.readLine()) + 1000] = true;
			
		}
		
		for(int i = 0; i < 2001; i++) {
			if(arr[i]) {
				System.out.println(i - 1000);
			}
		}
	}
}
