package BaekJoon;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.io.BufferedWriter;


public class Num_11021 {

	public static void main(String[] agrs) throws IOException {
		
		//case 1
//		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bw =  new BufferedWriter(new OutputStreamWriter(System.out));
//		StringTokenizer st;
//		
//		int T = Integer.parseInt(br.readLine());
//
//	
//		for (int i = 1; i <= T; i++) {
//			st = new StringTokenizer(br.readLine());
//			int A = Integer.parseInt(st.nextToken());
//			int B = Integer.parseInt(st.nextToken());
//			bw.write("Case #"+ i +": " + (A + B) + "\n");
//		
//		}
//		br.close();
//		
//		bw.flush();
//		bw.close();
		
		//case 2
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		
		int T = Integer.parseInt(br.readLine());

		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= T; i++) {
			String str = br.readLine();
			sb.append("Case #").append(i).append(": ")
			.append(str.charAt(0)-'0'+str.charAt(2)-'0').append('\n');
		}
	
		System.out.println(sb);
		
		br.close();
		
	}
}
