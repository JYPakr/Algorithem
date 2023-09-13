package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Num_2751 {
	
	public static void main(String[] agrs) throws IOException{
		
		
//		//case 1 
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		int n = Integer.parseInt(br.readLine());
//		
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		
//		for(int i = 0; i < n; i++) {
//			
//			list.add(Integer.parseInt(br.readLine()));
//
//		}
//		
//		Collections.sort(list);
//		
//		for(int val : list) {
//			sb.append(val).append('\n');
//		}
//		System.out.println(sb);
		
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		boolean[] arr = new boolean[2000001];
		
		for(int i = 0; i < n; i++) {
			
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
			
		}
		
		for(int i = 0; i < 2000001; i++) {
			if(arr[i]) {
				sb.append(i - 1000000).append('\n');
			}
		}
		System.out.println(sb);
	}
}
