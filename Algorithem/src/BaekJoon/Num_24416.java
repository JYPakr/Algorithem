package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Num_24416 {
	static int cnt = 0;
	static int cnt_1 = 0;
	
	public static void main(String[] agrs) throws IOException{
		
		
		//case 1 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		
		int n = Integer.parseInt(br.readLine());
		fib(n);
		fib2(n);
		System.out.println(cnt + " " + cnt_1);
		
	}
	
	public static int fib(int n) {
		   
		   if (n == 1 || n == 2) {
			   cnt ++; 
			   return 1; 
		   } 
		   else {
			   
			   return (fib(n - 1) + fib(n - 2));
		   }
	}
	
	public static int fib2(int n) {
		int[] dp = new int[n+1];

		dp[1] = 1;
		dp[2] = 1;
		
		for(int i=3; i<=n; i++) {
			cnt_1++;
			dp[i] = dp[i-1] + dp[i-2];
		}
		
	    return dp[n];
	}
	
}
