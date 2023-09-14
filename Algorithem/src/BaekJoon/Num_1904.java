package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_1904 {

	public static int[] dp = new int[1000001];
	public static void main(String[] agrs) throws IOException{
		
		
		//case 1 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int N = Integer.parseInt(br.readLine());
		

		// -1 로 초기화
		for(int i = 3; i < dp.length; i++) {
			dp[i] = -1;
		}
		
		System.out.println(Tile(N));
	}
	
	public static int Tile(int N) {
		if(dp[N] == -1) {
			dp[N] = (Tile(N - 1) + Tile((N - 2))) % 15746;
		}
		return dp[N];
	}
	
	
	
	
}
