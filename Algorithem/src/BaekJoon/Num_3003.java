package BaekJoon;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Num_3003 {
	
	public static void main(String[] agrs) throws IOException {
		
//		//case 1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//	
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		int[] arr = {1, 1, 2, 2, 2, 8};
//		
//		
//		for (int i = 0; i < 6; i++) {
//			
//			int N = Integer.parseInt(st.nextToken());
//		
//			if (arr[i] - N == 0) {
//				
//				arr[i] = 0;
//		
//			}
//			else {
//				arr[i] = arr[i] - N;
//			}
//			
//		}
//
//		
//		br.close();
//		
//		for (int k = 0; k < 6; k++) {
//			System.out.print(arr[k] + " ");
//		}
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int king = 1;
		int queen = 1;
		int rook = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;
		
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
	
		king = king - Integer.parseInt(st.nextToken());
		queen = queen - Integer.parseInt(st.nextToken());
		rook = rook - Integer.parseInt(st.nextToken());
		bishop = bishop - Integer.parseInt(st.nextToken());
		knight = knight - Integer.parseInt(st.nextToken());
		pawn = pawn - Integer.parseInt(st.nextToken());
		
		System.out.print(king + " ");
		System.out.print(queen + " ");
		System.out.print(rook + " ");
		System.out.print(bishop + " ");
		System.out.print(knight + " ");
		System.out.print(pawn + " ");		
		
		br.close();
		
	}
}
