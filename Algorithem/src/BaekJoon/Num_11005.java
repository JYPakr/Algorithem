package BaekJoon;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Scanner;

public class Num_11005 {

	public static void main(String[] agrs) throws IOException {
		
		//첫번째 풀이
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		String N = st.nextToken();
		int B = Integer.parseInt(st.nextToken());
		br.close();
		
		int tmp = 1;
		int sum = 0;
		
		for(int i = N.length() - 1; i >= 0; i--) {
			char C = N.charAt(i);
			
			if ('A' <= C && C <= 'Z') {
				sum += (C - 'A' + 10) * tmp;
				
			}else {
				sum += (C - '0') * tmp;
			}
			tmp *= B;
			
		}
		System.out.println(sum);

		
		
	
	}
}
