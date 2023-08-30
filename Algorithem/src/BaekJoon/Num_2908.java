package BaekJoon;
import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.StringTokenizer;

public class Num_2908 {

	public static void main(String[] args) throws IOException{
		
//		//case 1
//		Scanner sc = new Scanner(System.in);
//		
//		int A = sc.nextInt();
//		int B = sc.nextInt();
//		
//		sc.close();
//		
//		A = Integer.parseInt(new StringBuilder().append(A).reverse().toString());
//		B = Integer.parseInt(new StringBuilder().append(B).reverse().toString());
//		
//		System.out.print(A > B ? A : B);
//		
//		//case 2
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		int A = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//		int B = Integer.parseInt(new StringBuilder(st.nextToken()).reverse().toString());
//		
//		System.out.print(A > B ? A : B);
		
		//case 3
		int A = 0;
		int B = 0;
		
		A += System.in.read() - 48;
		A += (System.in.read() - 48)*10;
		A += (System.in.read() - 48)*100;
		
		System.in.read();	// 공백
		
		B += System.in.read() - 48;
		B += (System.in.read() - 48)*10;
		B += (System.in.read() - 48)*100;
		
		System.out.println(A > B ? A : B);
		
//		//case 4
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//		
//		int A = Integer.parseInt(st.nextToken());
//		int B = Integer.parseInt(st.nextToken());
//		
//		int reverse_a = 0;
//		int reverse_b = 0;
//		
//		while (A != 0) {
//			int digit = A % 10;
//			reverse_a = reverse_a * 10 + digit;
//			A /= 10;
//		}
//		
//		while (B != 0) {
//			int digit = B % 10;
//			reverse_b = reverse_b * 10 + digit;
//			B /= 10;
//		}
//		
//		if (reverse_a > reverse_b) {
//			System.out.println(reverse_a);
//		}else {
//			System.out.println(reverse_b);
//		}
//	
		
	}
}
