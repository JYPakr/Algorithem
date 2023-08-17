package BaekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Scanner;

public class Num_10952 {
	
	public static void main(String[] args) throws IOException{
	
		//case 1
//		Scanner sc = new Scanner(System.in);
//	
//		while(true) {
//			int A = sc.nextInt();
//			int B = sc.nextInt();
//			
//			if(A==0 && B==0) {
//				sc.close();
//				break;
//			}
//			
//			System.out.println(A+B);
//		}
		
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			
			st = new StringTokenizer(br.readLine(), " ");
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			
			if(A==0 && B==0) {
				break;
			}
			sb.append((A+B)).append('\n');
			
		}
		System.out.println(sb);
	
	}
}
