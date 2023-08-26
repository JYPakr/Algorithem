package BaekJoon;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Num_10809 {
	
	public static void main(String[] args) throws IOException{
		
//		//case 1 
//		Scanner sc = new Scanner(System.in);
//	
//		int arr[] = new int[26];
//		
//		//배열 모두 -1로 초기화
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = -1;
//		}
//		
//		
//		String S = sc.next();
//		
//		sc.close();
//		
//		for(int i = 0; i < S.length(); i++) {
//			char ch = S.charAt(i);
//			
//			if(arr[ch - 'a'] == -1) { // arr 원소 값이 -1인 경우에만 초기화
//				arr[ch - 'a'] = i;
//			}
//		}
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		int[] arr = new int[26];
	
		for(int i = 0; i < arr.length; i++) {
			arr[i] = -1;
		}
	
		String S = br.readLine();
		
		br.close();
		
		for(int i = 0; i < S.length(); i++) {
			char ch = S.charAt(i);
    
			if(arr[ch - 'a'] == -1) {	// arr 원소 값이 -1 인 경우에만 초기화
				arr[ch - 'a'] = i;
			}
		}
		
		for(int val : arr) {	// 배열 출력
			System.out.print(val + " ");
		}
		
	}
}
