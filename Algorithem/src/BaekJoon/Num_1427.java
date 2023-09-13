package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Num_1427 {
	
	public static void main(String[] agrs) throws IOException{
		
		
//		//case 1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		
//		String str = br.readLine();
//		
//		char[] arr = str.toCharArray();
//	
//		Arrays.sort(arr);
//	
//		for(int i = arr.length - 1; i >= 0; i--) {
//			sb.append(arr[i]);
//		}
//		
//		System.out.println(sb);
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		String str = br.readLine();
		
		int[] counting = new int[10];
		
		for (int i = 0; i < str.length(); i++) {
			counting[str.charAt(i) - '0']++;
		}
		
		
		for(int i = 9; i >= 0; i--) {
			while (counting[i]-- > 0) {
				sb.append(i);
			}
		}
		
		System.out.println(sb);
	}
}
