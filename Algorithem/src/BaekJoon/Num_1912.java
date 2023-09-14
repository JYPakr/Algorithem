package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//문제 보류
public class Num_1912 {
	
	static int[] arr;		// 배열 
	static Integer[] dp;		// 메모이제이션 할 dp
	static int max;			// 최댓값 변수 
	
	public static void main(String[] agrs) throws IOException{
		
		
		//case 1 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		dp = new Integer[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
	}
	
	public static int func(int n) {

		if(dp[n] == -1) {
			//(이전 배열의 누적합 + 현재 값)과 현재 값을 비교하여 최댓값을 N위치에 저장
			return Math.max(func(n - 1) + arr[n], arr[n]);
			
		}
		
		return dp[n];
		
	}
	
}
