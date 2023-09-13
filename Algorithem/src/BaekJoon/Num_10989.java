package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Num_10989 {
	
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
		
		int[] cnt = new int[10001];
		
		for(int i = 0; i < n; i++) {
			
			cnt[Integer.parseInt(br.readLine())]++;
			
		}
		
		for(int i = 1; i < 10001; i++) {
			//i값이 개수가 0이 될 때까지 출력 (빈도수를 의미)
			while(cnt[i] > 0) {
				sb.append(i).append('\n');
				cnt[i]--;
			}
			
			
		}
		System.out.println(sb);
	}
}
