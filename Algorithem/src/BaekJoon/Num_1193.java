package BaekJoon;

import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;


public class Num_1193 {
	
	public static void main(String[] agrs) throws IOException {
		
		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int X = Integer.parseInt(br.readLine());
	
		int cross_cnt = 1, prev_count_sum = 0;
		br.close();
		while(true) {
			//직선 대각선 누적 합 + 해당 대각선 개수 이용한 범위 판별
			if(X <= prev_count_sum + cross_cnt) {
				
				if (cross_cnt % 2 == 1) {	// 대각선의 개수가 홀수라면 
					// 분자가 큰 수부터 시작
					// 분자는 대각선상 블럭의 개수 - (X 번째 - 직전 대각선까지의 블럭 개수 - 1) 
					// 분모는 X 번째 - 직전 대각선까지의 블럭 개수
					System.out.print((cross_cnt - (X - prev_count_sum - 1)) + "/" + (X - prev_count_sum));
					break;
				} 
				
				else {	// 대각선의 개수가 짝수라면 
					// 홀수일 때의 출력을 반대로 
					System.out.print((X - prev_count_sum) + "/" + (cross_cnt - (X - prev_count_sum - 1)));
					break;
				}
				
				
			} else {
				prev_count_sum += cross_cnt;
				cross_cnt++;
			}
			
			
			
		}

		
		
	}
}
