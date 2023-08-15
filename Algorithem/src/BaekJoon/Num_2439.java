package BaekJoon;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Num_2439 {
	
	public static void main(String[] args) throws IOException{
		

//		//case 1
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int N = Integer.parseInt(br.readLine());
//		br.close();
//
//		for(int i = 1; i <= N; i++) {
//			
//			for(int j = 1; j <= N - i; j++) {
//				System.out.print(" ");
//			}
//
//			for (int k = 1; k <= i; k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int N = Integer.parseInt(br.readLine());
		br.close();

		for(int i = 1; i <= N; i++) {
			
			for(int j = 1; j <= N - i; j++) {
				bw.write(' ');
			}

			for (int k = 1; k <= i; k++) {
				bw.write('*');
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
}
