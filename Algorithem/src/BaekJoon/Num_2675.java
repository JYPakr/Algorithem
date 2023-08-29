package BaekJoon;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;


public class Num_2675 {
	
	public static void main(String[] agrs) throws IOException {
		
//		//case 1
//		Scanner sc = new Scanner(System.in);
//		
//		int T = sc.nextInt();
//		for(int i = 0; i < T; i++) {
//			
//			int R = sc.nextInt();
//			String S = sc.next();
//			
//			for(int j = 0; j < S.length(); j++) {
//				for(int k = 0; k < R; k++) {
//					System.out.println(S.charAt(k));
//				}
//			}
//			
//			System.out.println();
//		}
		
		
//		//case 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int T = Integer.parseInt(br.readLine());
//	
//		for (int i = 0; i < T; i++) {
//			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//			
//			int N = Integer.parseInt(st.nextToken());
//			String str = st.nextToken(); 
//		
//			for (int k = 0; k < str.length(); k++) {
//				
//				for(int a = 0; a < N; a++) {
//					System.out.print(str.charAt(k));
//				}
//				
//			}
//			System.out.println();
//		}
//
//		br.close();
	
//		//case 3
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int T = Integer.parseInt(br.readLine());
//	
//		for(int i = 0; i < T; i++) {
//			
//			String[] str = br.readLine().split(" ");
//			
//			int R = Integer.parseInt(str[0]);
//			String S = str[1];
//			
//			for(int j = 0; j < S.length(); j++) {
//				for(int k = 0; k < R; k++) {
//					System.out.println(S.charAt(j));
//				}
//				
//			}
//			
//			System.out.println();
//		}
//		
//		br.close();
		
		//case 4
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
	
		for(int i = 0; i < T; i++) {
			
			String[] str = br.readLine().split(" ");
			
			int R = Integer.parseInt(str[0]);
	
			for(byte val : str[1].getBytes()) {
				for(int j = 0; j < R; j++) {
					sb.append((char)val);
				}
				
			}
			sb.append('\n');
		}
		br.close();
		System.out.print(sb);
		
	}
}
