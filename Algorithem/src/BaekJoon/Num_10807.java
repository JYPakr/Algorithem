package BaekJoon;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.IOException;

public class Num_10807 {
	
	public static void main(String[] args) throws IOException{

		
		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		
		int count = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		for (int i = 0; i < N; i ++) {
			
			arr[i] = Integer.parseInt(st.nextToken());
			
		}
	
		int V = Integer.parseInt(br.readLine());
		
		for (int k = 0; k < N; k ++) {
			
			if (arr[k] == V) {
				count ++;
			}
			
		}
		
		
		br.close();
		
		System.out.println(count);
	}
}
