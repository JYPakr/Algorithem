package BaekJoon;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2588 {
	public static void main(String[] agrs) throws IOException {
		
		//첫번째 풀이
//		Scanner sc = new Scanner(System.in);
//		
//		int A = sc.nextInt();
//		String B = sc.next();
//		
//		sc.close();
//		
//		System.out.println(A * (B.charAt(2) - '0'));
//		System.out.println(A * (B.charAt(1) - '0'));
//		System.out.println(A * (B.charAt(0) - '0'));
//		System.out.println(A * Integer.parseInt(B));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(A * (B%10));
		sb.append('\n');
		
		sb.append(A * ((B%100)/10));
		sb.append('\n');
        
		sb.append(A * (B/100));
		sb.append('\n');
        
		sb.append(A * B);
 
		System.out.print(sb);
		
		
		
		
	}
}
