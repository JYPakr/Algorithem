package BaekJoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Num_2438 {
	
	public static void main(String[] args) throws IOException{
		
		//case 1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int N = Integer.parseInt(br.readLine());
//		br.close();
//		String str = "";
//	
//		for(int i = 1; i <= N; i++) {
//			
//			str += "*";
//			System.out.println(str);
//		}
		
		//case 2
//		for(int i = 1; i <= N; i++) {
//			
//			for (int j = 1; j <= i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//case 3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		br.close();

		StringBuilder sb = new StringBuilder();
		
		for(int i = 1; i <= N; i++) {
			for(int j = 1; j <= i; j++) {
				sb.append('*');
			}
			sb.append('\n');
		}
		System.out.print(sb);
	}
}
