package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Num_2164 {

	public static void main(String[] agrs) throws IOException {
		
		//case1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
	
		Deque<Integer> q = new LinkedList<>();
		
		for(int i = 1; i <= n; i++) {
			q.offer(i);
		}
		//q = 12345
		while(q.size() > 1) {
			q.poll(); //맨 앞 원소 버림
			q.offer(q.poll()); //맨 앞의 원소를 버림과 동시에 버려진 원소를 맨 뒤에 삽입
			
		}
	
		System.out.println(q.poll()); //마지막으로 남은 원소 출력

		
	}
}
