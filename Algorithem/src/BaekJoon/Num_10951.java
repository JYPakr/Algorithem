package BaekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.io.IOException;
import java.util.Scanner;

public class Num_10951 {
	
	public static void main(String[] args) throws IOException{
	
		//case 1
//		Scanner sc = new Scanner(System.in);
//	
//		while(sc.hasNextInt()) {
//			
//			int A = sc.nextInt();
//			int B = sc.nextInt();
//			
//			
//			System.out.println(A+B);
//		}
//		sc.close();
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		String str;
		
		while((str=br.readLine()) != null) {
			
			st = new StringTokenizer(str, " ");
			if(!st.hasMoreTokens()) {
				break;
			}
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
		
			sb.append((A+B)).append('\n');
			
		}
		System.out.println(sb);
	
	}
}
