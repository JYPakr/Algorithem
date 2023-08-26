package BaekJoon;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;



public class Num_11720 {
	
	public static void main(String[] args) throws IOException{
		
//		//case 1
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		String a = sc.next();
//		sc.close();
//		
//		int sum = 0;
//		
//		for (int i = 0; i < N; i++) {
//			
//			sum +=  a.charAt(i) - '0';
//		}
//		
//		System.out.println(sum);
		
		//case 2
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int sum = 0;
		
		for(byte value : br.readLine().getBytes()) {
			sum += (value - '0');
		}
		
		System.out.println(sum);
		
	}
}
