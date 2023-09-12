package BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Num_2738 {
	
	public static void main(String[] agrs) throws IOException {
		
		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int [][] arr_1 = new int[n][m];
		int [][] arr_2 = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < m; j++) {
				arr_1[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for(int j = 0; j < m; j++) {
				arr_2[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				System.out.print(arr_1[i][j] + arr_2[i][j] + " ");
			
			}
			System.out.println();
		}
		
		
		br.close();
	
	
	}
}
