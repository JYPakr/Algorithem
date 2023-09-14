package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_9461 {

	public static long[] dp = new long[101];
	public static void main(String[] agrs) throws IOException{
		
		
		//case 1 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		dp[0] = 0;
		dp[1] = 1;
		dp[2] = 1;
		dp[3] = 1;
		
		for(int i = 4; i < dp.length; i++) {
			dp[i] = -1;
		}
		
		int t = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < t; i++) {
			
			int n = Integer.parseInt(br.readLine());
			sb.append(func(n)).append("\n");
		}
	
		System.out.println(sb);
	}
	
	public static long func(int n) {

		if(dp[n] == -1) {
			
			return dp[n] = func(n - 3) + func(n - 2);
			
		}
		
		return dp[n];
		
	}
	
}
