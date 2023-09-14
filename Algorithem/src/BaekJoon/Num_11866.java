package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Num_11866 {

	public static void main(String[] agrs) throws IOException {
		
		//case1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<>();
	
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		
		
		for(int i = 1; i <= n; i++) {
			q.offer(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		
		
		/*
		 *  마지막 부분의 출력은 > 괄호 전에 공백이 없기 때문에
		 *  일괄적으로 출력하기 위해 마지막 원소만 남겨질 때까지만
		 *  반복하고 마지막 원소는 그대로 출력한다.
		 */
		
		while(q.size() > 1) {
		
			for(int i = 0; i < k - 1; i++) {
				q.offer(q.poll());
			}
			
			sb.append(q.poll()).append(", ");
		}
	
		sb.append(q.poll()).append('>');
		System.out.println(sb); 

		
	}
}
