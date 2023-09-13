package BaekJoon;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Num_24313 {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int a1= Integer.parseInt(st.nextToken());
		int a0= Integer.parseInt(st.nextToken());

		int c = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		int fn = a1*n + a0;
		
		
		if (fn <= c*n && c >= a1) {
			System.out.println("1");
		}else {
			System.out.println("0");
		}
		
	}
}
