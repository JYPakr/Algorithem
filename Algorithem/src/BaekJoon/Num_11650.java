package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Num_11650 {
	
	public static void main(String[] agrs) throws IOException{
		

		//case 1
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] arr = new int[n][2];
		
		StringTokenizer st;
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][0] = Integer.parseInt(st.nextToken());
		}
		
//		Arrays.sort(arr, new Comparator<int[]>() {
//			
//			@Override
//			public int compare(int[] e1, int[] e2) {
//				if(e1[0] == e2[0]) {		// 첫번째 원소가 같다면 두 번째 원소끼리 비교
//					return e1[1] - e2[1];
//				}
//				else {
//					return e1[0] - e2[0];
//				}
//			}
//			
//		});
		
		//람다식
		Arrays.sort(arr, (e1, e2) -> {
			
			if(e1[0] == e2[0]) {
				return e1[1] - e2[1];
			}else {
				return e1[0] - e2[0];
			}
			
		});
		
		for(int i = 0; i < n; i++) {
			sb.append(arr[i][1] + " " + arr[i][0]).append('\n');
		}
		
		
		System.out.println(sb);
	}
}
