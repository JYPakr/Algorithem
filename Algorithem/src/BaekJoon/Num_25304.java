package BaekJoon;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Num_25304 {

	public static void main(String[] agrs) throws IOException {
		
		
		
		//case1
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int x = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		int sum = 0;
		
		br.close();
		StringTokenizer st;
		
		for (int i = 0; i < n; i++) {
			
			st = new StringTokenizer(br.readLine(), " ");
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
	
		    sum += a * b;
		}
		
		if (sum == x) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		

	}
}
